SUMMARY = "A Python SVG converter based on Cairo"
DESCRIPTION = "CairoSVG is a SVG converter based on Cairo. It can export SVG files to PDF, \
PostScript and PNG files. \
 \
For further information, please visit the CairoSVG website, http://www.cairosvg.org."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "python39-CairoSVG-2.7.0-1.2.noarch.rpm"
RPM_HASH = "e7da6c278b568e71ad4e0e41563ba2a6e6544320371c33f845e9325b036e569848ecd35548824fa277ae2f8f3af1915d7702cc1c21a7c2a1f10bd1a428b79012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cairosvg \
python39-CairoSVG \
python3dist-cairosvg"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Pillow \
python39-cairocffi \
python39-cssselect2 \
python39-defusedxml \
python39-tinycss2 \
update-alternatives"

inherit rpm
