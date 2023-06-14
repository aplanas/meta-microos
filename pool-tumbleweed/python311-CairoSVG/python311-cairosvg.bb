SUMMARY = "A Python SVG converter based on Cairo"
DESCRIPTION = "CairoSVG is a SVG converter based on Cairo. It can export SVG files to PDF, \
PostScript and PNG files. \
 \
For further information, please visit the CairoSVG website, http://www.cairosvg.org."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "python311-CairoSVG-2.7.0-1.1.noarch.rpm"
RPM_HASH = "312286225c2bc7427774d10c4e600b77966689b542062c7c85ad924212a734e4aaf457999081f53d468668ed073cf0b066f95002d1b59f76bb804aedad2e0fcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-cairosvg \
python311-CairoSVG \
python3dist-cairosvg"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-Pillow \
python311-cairocffi \
python311-cssselect2 \
python311-defusedxml \
python311-tinycss2 \
update-alternatives"

inherit rpm
