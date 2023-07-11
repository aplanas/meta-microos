SUMMARY = "A Python SVG converter based on Cairo"
DESCRIPTION = "CairoSVG is a SVG converter based on Cairo. It can export SVG files to PDF, \
PostScript and PNG files. \
 \
For further information, please visit the CairoSVG website, http://www.cairosvg.org."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "python310-CairoSVG-2.7.0-1.2.noarch.rpm"
RPM_HASH = "2c465c10e3c96df282afbca021e0ee2c18fcbc523cf5d5169e60272a1bd16230f7a366b4742d711167c5e10a0b266fa77bcc2a52440b360e4dafca40a69362f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cairosvg \
python310-CairoSVG \
python3dist-cairosvg"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Pillow \
python310-cairocffi \
python310-cssselect2 \
python310-defusedxml \
python310-tinycss2 \
update-alternatives"

inherit rpm
