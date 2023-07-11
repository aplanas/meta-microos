SUMMARY = "A python svg graph plotting library"
DESCRIPTION = "Pygal is a dynamic SVG charting library written in python. \
It supports various chart types and CSS styling."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "python310-pygal-3.0.0-3.3.noarch.rpm"
RPM_HASH = "cb30b6157ee8f8b81be659d728fb66e9664ede99d5a58db3f7a6759e23b5030015695120bf42d967e5d9ccd18c4b8c0cc936d45dcf82812c8b9227ef18fa48fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pygal \
python310-pygal \
python3dist-pygal"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-lxml \
update-alternatives"

inherit rpm
