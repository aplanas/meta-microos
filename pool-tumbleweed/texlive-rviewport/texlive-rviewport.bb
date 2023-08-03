SUMMARY = "Relative Viewport for Graphics Inclusion"
DESCRIPTION = "Package graphicx provides a useful keyword viewport which \
allows to show just a part of an image. However, one needs to \
put there the actual coordinates of the viewport window. \
Sometimes it is useful to have relative coordinates as \
fractions of natural size. For example, one may want to print a \
large image on a spread, putting a half on a verso page, and \
another half on the next recto page. For this one would need a \
viewport occupying exactly one half of the file's bounding box, \
whatever the actual width of the image may be. This package \
adds a new keyword rviewport to the graphicx package \
specifiying Relative Viewport for graphics inclusion: a window \
defined by the given fractions of the natural width and height \
of the image."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn23739"

RPM_NAME = "texlive-rviewport-2023.209.1.0svn23739-54.1.noarch.rpm"
RPM_HASH = "0fcc5019d19b7bf74ce05058b2c9592f785f7b3215f36c1dca4c7bcbb2d4f256741235ad149d390e856c9ea54cd71051ba9676d07f2c46d3a9c32abb82ce5540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rviewport.sty \
texlive-rviewport"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
