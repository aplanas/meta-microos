SUMMARY = "Multimedia inclusion for the dvisvgm backend"
DESCRIPTION = "This package implements an interface for embedding video and \
audio files in SVG (Scalable Vector Graphics) output. SVG with \
embedded media is very portable, as it is supported by all \
modern Web browsers across a variety of operating systems and \
platforms, including portable devices. All DVI producing TeX \
engines can be used. The dvisvgm utility, which is part of all \
major TeX distributions, converts the intermediate DVI to SVG. \
By default, media files are embedded into the SVG output to \
make self-sufficient SVG files."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.13svn64686"

RPM_NAME = "texlive-media4svg-2023.208.0.0.13svn64686-53.1.noarch.rpm"
RPM_HASH = "86c0a0ca8618dca12cf5ddb99baa9014acecef244a9d54592fe83d90ae1d71e1e1ea79b5a988fcc47a9bc626b65e62096376f2f1cb900447d7721890add44629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-media4svg.sty \
texlive-media4svg"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdfbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
