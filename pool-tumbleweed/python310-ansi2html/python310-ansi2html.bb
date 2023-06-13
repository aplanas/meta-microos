SUMMARY = "Python module to convert text with ANSI color codes to HTML or LaTeX"
DESCRIPTION = "A module to convert text with ANSI color codes to HTML or to LaTeX."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "python310-ansi2html-1.8.0-2.1.noarch.rpm"
RPM_HASH = "61b665db69718d289366d847028829bc5a164264ac059ff513b9ec21bfde608ab2768f5697899ce0c4d706c2f3d3dc280b0515dfaa980997c851771b6b3e8717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansi2html \
python3.10dist(ansi2html) \
python310-ansi2html \
python3dist(ansi2html)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-six \
update-alternatives"

inherit rpm
