SUMMARY = "A python svg graph plotting library"
DESCRIPTION = "Pygal is a dynamic SVG charting library written in python. \
It supports various chart types and CSS styling."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "python39-pygal-3.0.0-3.1.noarch.rpm"
RPM_HASH = "df5322ba7d8257ba2ca5286cbefd3210f884f3d625414f68bc2c8f74b8d099170f804a8871fcc7aec9b92158063a333ca7bff04e5f97c7c983385f4320ca5779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pygal) \
python39-pygal \
python3dist(pygal)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-lxml \
update-alternatives"

inherit rpm
