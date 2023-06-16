SUMMARY = "A Python SVG converter based on Cairo"
DESCRIPTION = "CairoSVG is a SVG converter based on Cairo. It can export SVG files to PDF, \
PostScript and PNG files. \
 \
For further information, please visit the CairoSVG website, http://www.cairosvg.org."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "python39-CairoSVG-2.7.0-1.1.noarch.rpm"
RPM_HASH = "98324accaae26aa8dfd98fe74cb068f3d54713e42c4c02166ef5ddc9aed92e1df6a033568f8922d2d8375ee4b3c1659cd1d1b8c637f364ba9ea5282b68aba21f"
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
