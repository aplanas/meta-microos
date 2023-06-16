SUMMARY = "A python svg graph plotting library"
DESCRIPTION = "Pygal is a dynamic SVG charting library written in python. \
It supports various chart types and CSS styling."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "python310-pygal-3.0.0-3.1.noarch.rpm"
RPM_HASH = "939546204c8f61bc9165f8fbee52efb7a784e76352fdb1902f6e39f3ed1bf22e9328413bb8f38a86a912cb8cb4c7ca7feac36d09a8a25f455d965eb0feea00e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygal \
python3.10dist-pygal \
python310-pygal \
python3dist-pygal"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-lxml \
update-alternatives"

inherit rpm
