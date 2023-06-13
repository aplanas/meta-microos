SUMMARY = "Creating documentation from source code"
DESCRIPTION = "The package creates documentation from C source code, or other \
programming languages."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn34294"

RPM_NAME = "texlive-docbytex-2023.201.svn34294-52.1.noarch.rpm"
RPM_HASH = "282cf9aaee65262bd69724b00d5ab38877ed0d969e64c485b0e588570948089d1b4e35c1ceb9ff65279a690513b77c5fe72a551be9368db90e05df0e11c7eb59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(docby.tex) \
texlive-docbytex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
