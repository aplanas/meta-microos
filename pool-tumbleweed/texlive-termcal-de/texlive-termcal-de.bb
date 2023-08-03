SUMMARY = "German localization for termcal"
DESCRIPTION = "This package provides a German localization to the termcal \
package written by Bill Mitchell, which is intended to print a \
term calendar for use in planning a class. termcal-de depends \
on the following other packages: termcal, pgfkeys, pgfopts, \
datetime2, and datetime2-german."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn47111"

RPM_NAME = "texlive-termcal-de-2023.209.2.0svn47111-55.1.noarch.rpm"
RPM_HASH = "df6651f1f886251e9f611b05eb4832fcbeab527dfecd5faa9938d18a236e66b59a844610f4efe498428e677ed03907aa6732d6b24b550ae7e544fd904ba1ac75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-termcal-de.sty \
texlive-termcal-de"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datetime2.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-termcal.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
