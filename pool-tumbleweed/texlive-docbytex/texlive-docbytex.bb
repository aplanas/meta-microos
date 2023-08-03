SUMMARY = "Creating documentation from source code"
DESCRIPTION = "The package creates documentation from C source code, or other \
programming languages."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn34294"

RPM_NAME = "texlive-docbytex-2023.209.svn34294-53.1.noarch.rpm"
RPM_HASH = "c92d17bc08ac5fa1c14d21a95f562f69d8ba20b6e5d2e05f5d8c12e5b699aa1762b5ca903e7cf5fc251e5ff201993f70d5c81e9cdbbff574e1b17e2cf4e3af48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-docby.tex \
texlive-docbytex"

RDEPENDS:${PN} += "/usr/bin/sh \
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
