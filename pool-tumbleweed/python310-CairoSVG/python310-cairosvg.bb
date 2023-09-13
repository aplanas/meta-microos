SUMMARY = "A Python SVG converter based on Cairo"
DESCRIPTION = "CairoSVG is a SVG converter based on Cairo. It can export SVG files to PDF, \
PostScript and PNG files. \
 \
For further information, please visit the CairoSVG website, http://www.cairosvg.org."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "python310-CairoSVG-2.7.1-1.1.noarch.rpm"
RPM_HASH = "9d79374248f203d501283b9001c0358bfe262750fef7ece1f6015ba47de897f3ed0fa041188971df7b044d4a79cba57a6c5c06c4bfb64dac11b4433b80fb928a"
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
