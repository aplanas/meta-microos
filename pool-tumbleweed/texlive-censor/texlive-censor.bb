SUMMARY = "Tools for producing redacted documents"
DESCRIPTION = "This package provides simple tools for creating redacted \
documents with blacked-out text. Its tools are useful both for \
creating documents in a restricted environment (for redacted \
release in an unrestricted environment) as well as in an \
unrestricted environment (for eventual transfer and completion \
in the restricted environment)."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn63126"

RPM_NAME = "texlive-censor-2023.209.4.2svn63126-53.1.noarch.rpm"
RPM_HASH = "f994eb16d2b573ecf3b1cd18e20431aaa099b3ecb03e107912d3c5f2a9834575ac6f67bf4c853f858173300e1375bcdfc61aced3fc5ae023509b5c54cc880999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-censor.sty \
texlive-censor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pbox.sty \
tex-tokcycle.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
