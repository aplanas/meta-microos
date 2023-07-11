SUMMARY = "A schema-based serialization and deserialization library"
DESCRIPTION = "An extensible package which can be used to: \
 \
- deserialize and validate a data structure composed of strings, \
  mappings, and lists. \
 \
- serialize an arbitrary data structure to a data structure composed \
  of strings, mappings, and lists."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "1.7.0"

RPM_NAME = "python311-colander-1.7.0-5.14.noarch.rpm"
RPM_HASH = "ab6caba0b3e3b81bd884a96e788d8815f4391824ff98fc7e7c896dbcb1524df79a77534342f9fbcb55568be1612cbcc4455da0b2130e2303b28e8242c5ca54d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colander \
python3.11dist-colander \
python311-colander \
python3dist-colander"

RDEPENDS:${PN} += "python-abi \
python311-iso8601 \
python311-translationstring"

inherit rpm
