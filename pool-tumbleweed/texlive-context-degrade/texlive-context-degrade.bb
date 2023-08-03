SUMMARY = "Degrading JPEG images in ConTeXt"
DESCRIPTION = "The context-degrade package"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-degrade-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "28b22950980ef5d9d953980a12520ca5944b727826ed60bfb23453394ac5d0b4e565364c65c328f8237b6c7cda30b2355262394c0a5fade2d98079e5748d781b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-degrade.tex \
texlive-context-degrade"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
