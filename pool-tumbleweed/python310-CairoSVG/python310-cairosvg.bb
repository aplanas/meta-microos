SUMMARY = "A Python SVG converter based on Cairo"
DESCRIPTION = "CairoSVG is a SVG converter based on Cairo. It can export SVG files to PDF, \
PostScript and PNG files. \
 \
For further information, please visit the CairoSVG website, http://www.cairosvg.org."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "python310-CairoSVG-2.7.0-1.1.noarch.rpm"
RPM_HASH = "3c141ddf0038fff44cc34199599d20eb5832d0adfeeb3973da49c120ac6335ffa114d0252f261649c9590764c889bf65f3db0a7627221a3bab2b55c5a57ef113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CairoSVG \
python3.10dist-cairosvg \
python310-CairoSVG \
python3dist-cairosvg"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-Pillow \
python310-cairocffi \
python310-cssselect2 \
python310-defusedxml \
python310-tinycss2 \
update-alternatives"

inherit rpm
