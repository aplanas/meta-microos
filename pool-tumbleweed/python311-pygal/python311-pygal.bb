SUMMARY = "A python svg graph plotting library"
DESCRIPTION = "Pygal is a dynamic SVG charting library written in python. \
It supports various chart types and CSS styling."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "python311-pygal-3.0.0-3.3.noarch.rpm"
RPM_HASH = "cb31007c2f0a9704e4c455a06a8995dbb550ae98d98298564de644926d9e69f35453b315e24e4d10b31ce6672cea6203ced07bc4054a9cebf0425cac68eb220c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygal \
python3.11dist-pygal \
python311-pygal \
python3dist-pygal"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-lxml \
update-alternatives"

inherit rpm
