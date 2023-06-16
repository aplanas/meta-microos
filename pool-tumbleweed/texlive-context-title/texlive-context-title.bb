SUMMARY = "Place document titles"
DESCRIPTION = "The title module provides the \\placetitle command to put a \
title block into your document. With the command \\setuptitle \
values can be set for \\placetitle and change the formatting of \
the content."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-title-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "5114847af7582095b31f20346fbc7c9447c9f81299658a0f982424f55d2be8a3bfd29fcf79de99301e8a8282fa85ed2cad4f52d03dfef76d4038daa8bb7f294b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-title"

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
