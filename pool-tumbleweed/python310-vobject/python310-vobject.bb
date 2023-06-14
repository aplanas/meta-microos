SUMMARY = "Python package for parsing and creating iCalendar and vCard files"
DESCRIPTION = "Parses iCalendar and vCard files into Python data structures, \
decoding the relevant encodings. Also serializes vobject data \
structures to iCalendar, vCard, or (experimentally) hCalendar \
unicode strings."
LICENSE = "Apache-2.0"

PV = "0.9.6.1"

RPM_NAME = "python310-vobject-0.9.6.1-2.19.noarch.rpm"
RPM_HASH = "164db75500f6aa04825642db7a2d305062eaf16fefd7fb2f8c6c9a1ddae6537054c2f567ae699cdc5f59d845af5170a79c7928f4bcdf562c2239800ef6ef2254"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vobject \
python3.10dist-vobject \
python310-vobject \
python3dist-vobject \
vobject"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-python-dateutil \
python310-six \
update-alternatives"

inherit rpm
