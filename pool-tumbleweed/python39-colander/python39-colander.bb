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

RPM_NAME = "python39-colander-1.7.0-5.12.noarch.rpm"
RPM_HASH = "4fecce7f3ea34bdb9bb1f094296b07beddcfc5fda451683b8a9f20c62fb76587b3bb4dae5dbc80abbb9c2491a75c5f3b2210ae730f9dc65d34a12b4609eb4389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-colander \
python39-colander \
python3dist-colander"

RDEPENDS:${PN} += "python-abi \
python39-iso8601 \
python39-translationstring"

inherit rpm
