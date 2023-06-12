SUMMARY = "Python package for parsing and creating iCalendar and vCard files"
DESCRIPTION = "Parses iCalendar and vCard files into Python data structures, \
decoding the relevant encodings. Also serializes vobject data \
structures to iCalendar, vCard, or (experimentally) hCalendar \
unicode strings."
LICENSE = "Apache-2.0"

PV = "0.9.6.1"

RPM_NAME = "python39-vobject-0.9.6.1-2.19.noarch.rpm"
RPM_HASH = "b021202ac3458a7134460f3e20c229183f28d3502ff4a8b2d404d4b2c3e37c8cad5cb7705205e82b6b6a02629e5c4a9239824c914de055a60243c92cfde7c3ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vobject) \
python39-vobject \
python3dist(vobject) \
vobject"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-python-dateutil \
python39-six \
update-alternatives"

inherit rpm
