SUMMARY = "A practical guide to LaTeX and Polyglossia for Marathi and other Indian languages"
DESCRIPTION = "The package provides a short guide to LaTeX and specifically to \
the polyglossia package. This document aims to introduce LaTeX \
and polyglossia for Indian languages. Though the document often \
discusses the language Marathi, the discussion applies to other \
India languages also, with some minute changes which are \
described in Section 1.2. We assume that the user of this \
document knows basic (La)TeX or has, at least, tried her hand \
on it. This document is not very suitable for first time users."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55475"

RPM_NAME = "texlive-latex-mr-2023.209.1.0svn55475-56.1.noarch.rpm"
RPM_HASH = "317c61c67757eb5877511170b5b4e3583a553461c38abffcd1a8c11ceb68d75f4d696ccad99b3f5c4f197098bc5a36a8d6b4f56a6d7beeb24007cf4c728aa4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-mr"

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
