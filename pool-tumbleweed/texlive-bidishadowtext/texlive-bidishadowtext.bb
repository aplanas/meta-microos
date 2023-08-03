SUMMARY = "Bidi-aware shadow text"
DESCRIPTION = "This package allows you to typeset bidi-aware shadow text. It \
is a re-implementation of the shadowtext package adding bidi \
support."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn34633"

RPM_NAME = "texlive-bidishadowtext-2023.209.0.0.1svn34633-54.1.noarch.rpm"
RPM_HASH = "0c565c3a48575bda84f6721ddf3da38e02b8e748133c0c8fde11a5403814aad3b468e06b57e161acdd8409fc27aefb549250cc80da92634f0efdd86233ce03dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidishadowtext.sty \
texlive-bidishadowtext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
