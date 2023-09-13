SUMMARY = "A Python SVG converter based on Cairo"
DESCRIPTION = "CairoSVG is a SVG converter based on Cairo. It can export SVG files to PDF, \
PostScript and PNG files. \
 \
For further information, please visit the CairoSVG website, http://www.cairosvg.org."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "python311-CairoSVG-2.7.1-1.1.noarch.rpm"
RPM_HASH = "cc0365432a0d965a549133d5499951a84effdf7545bcd186575ea96d50cc8cac9a280fcdc0d29d522dd0db00f728bf75e4d39cc8ef0aa297161f7996ec3ce1e1"
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
