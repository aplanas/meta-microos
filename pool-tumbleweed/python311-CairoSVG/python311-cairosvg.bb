SUMMARY = "A Python SVG converter based on Cairo"
DESCRIPTION = "CairoSVG is a SVG converter based on Cairo. It can export SVG files to PDF, \
PostScript and PNG files. \
 \
For further information, please visit the CairoSVG website, http://www.cairosvg.org."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "python311-CairoSVG-2.7.0-1.2.noarch.rpm"
RPM_HASH = "c03217668d9d4666c69449d1f551005732d27d11238576393b84c3d4aa18c37d3c047dd094dde03c57269b74a2c0a9333de92a7bbf394a105bfca20942f18e61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CairoSVG \
python3.11dist-cairosvg \
python311-CairoSVG \
python3dist-cairosvg"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Pillow \
python311-cairocffi \
python311-cssselect2 \
python311-defusedxml \
python311-tinycss2 \
update-alternatives"

inherit rpm
