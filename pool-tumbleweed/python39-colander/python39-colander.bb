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

RPM_NAME = "python39-colander-1.7.0-5.14.noarch.rpm"
RPM_HASH = "14e3d9c570b3cec01bc5eb532e5256640a8e4e73cb5954ea9d8e329aa4332642c4abb2b5c96569d6474f6627ac7ec784fd32da26a0f4e420522583b821abb41d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-colander \
python39-colander \
python3dist-colander"

RDEPENDS:${PN} += "python-abi \
python39-iso8601 \
python39-translationstring"

inherit rpm
