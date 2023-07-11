SUMMARY = "Python package for parsing and creating iCalendar and vCard files"
DESCRIPTION = "Parses iCalendar and vCard files into Python data structures, \
decoding the relevant encodings. Also serializes vobject data \
structures to iCalendar, vCard, or (experimentally) hCalendar \
unicode strings."
LICENSE = "Apache-2.0"

PV = "0.9.6.1"

RPM_NAME = "python310-vobject-0.9.6.1-3.1.noarch.rpm"
RPM_HASH = "7223b11e26ffbb8c6c699e2caebb7119c42e443648720c5808aa6b234b9a339f40a977ecc1487f9b4ef9a464aa1ba89c649bb134bb0f8ce09b2192e3e43b7c85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vobject \
python310-vobject \
python3dist-vobject \
vobject"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-python-dateutil \
python310-six \
update-alternatives"

inherit rpm
