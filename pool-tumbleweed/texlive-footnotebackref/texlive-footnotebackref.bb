SUMMARY = "Back-references from footnotes"
DESCRIPTION = "The package provides the means of creating hyperlinks, from a \
footnote at the bottom of the page, back to the occurence of \
the footnote in the main text."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn27034"

RPM_NAME = "texlive-footnotebackref-2023.209.1.0svn27034-53.1.noarch.rpm"
RPM_HASH = "2133303a12fbc02a6f2f628e84a423a989b4f517bb34cf2edf54b65833a7583d48b67b382de4b9d73afd0528795d62b64b07704235f98a0d115ece0a3a110679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footnotebackref.sty \
texlive-footnotebackref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-letltxmacro.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
