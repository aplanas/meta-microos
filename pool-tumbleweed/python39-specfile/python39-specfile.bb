SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python39-specfile-0.20.0-1.1.noarch.rpm"
RPM_HASH = "54c399f536cac72d3c650070da6f48abeaadb21d6685908c15d719d38ad0a7ca1e562e9436b6a3f91852294c57a5c2f063c78d2666e1cea9a869cacb8bc292e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-specfile \
python39-specfile \
python3dist-specfile"

RDEPENDS:${PN} += "python-abi \
python39-rpm"

inherit rpm
