SUMMARY = "Python package for parsing and creating iCalendar and vCard files"
DESCRIPTION = "Parses iCalendar and vCard files into Python data structures, \
decoding the relevant encodings. Also serializes vobject data \
structures to iCalendar, vCard, or (experimentally) hCalendar \
unicode strings."
LICENSE = "Apache-2.0"

PV = "0.9.6.1"

RPM_NAME = "python311-vobject-0.9.6.1-3.1.noarch.rpm"
RPM_HASH = "27537e4a5fece639d66f842a9295605f977be28d4fe2072aa62b8212845a5e9d3cfef7e5c2e9854412a1bec133e218c38b0e37b10078fe61660c7e4828d34914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vobject \
python3.11dist-vobject \
python311-vobject \
python3dist-vobject \
vobject"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-python-dateutil \
python311-six \
update-alternatives"

inherit rpm
