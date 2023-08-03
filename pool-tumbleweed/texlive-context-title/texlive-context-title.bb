SUMMARY = "Place document titles"
DESCRIPTION = "The title module provides the \\placetitle command to put a \
title block into your document. With the command \\setuptitle \
values can be set for \\placetitle and change the formatting of \
the content."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-title-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "e8e021622562569ed59e2269b63efabe9e8c09bca6cd94ce0861cbf0c1710f9063e27fc19be4b4a406b922c8c08f8db7271b98ed397aace46f7efce3834a8751"
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
