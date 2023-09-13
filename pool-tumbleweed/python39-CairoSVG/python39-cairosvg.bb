SUMMARY = "A Python SVG converter based on Cairo"
DESCRIPTION = "CairoSVG is a SVG converter based on Cairo. It can export SVG files to PDF, \
PostScript and PNG files. \
 \
For further information, please visit the CairoSVG website, http://www.cairosvg.org."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "python39-CairoSVG-2.7.1-1.1.noarch.rpm"
RPM_HASH = "12a9981cbca15a823ee6cfe0ac1dc90676d07c82715286f313c498467a76ef7537b6341e5c6759065022f28123f103ba89caed3130130608c003842e11dad202"
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
