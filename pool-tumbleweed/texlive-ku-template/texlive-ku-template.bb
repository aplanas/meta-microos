SUMMARY = "Copenhagen University or faculty logo for front page"
DESCRIPTION = "A comprehensive package for adding University of Copenhagen or \
faculty logo to your front page. For use by student or staff at \
University of Copenhagen (Kobenhavns Universitet)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn45935"

RPM_NAME = "texlive-ku-template-2023.209.0.0.02svn45935-56.1.noarch.rpm"
RPM_HASH = "cdff24be8b7fbba7a4c0c1fd30c631ff763e4391f568528c6e20bdf5eb268db423f9bc0adfec4132cec550598af7b0f57745426189d69c8e0d6d82b769a3786b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ku-template.sty \
texlive-ku-template"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-titling.sty \
tex-wallpaper.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
