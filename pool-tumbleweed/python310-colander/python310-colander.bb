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

RPM_NAME = "python310-colander-1.7.0-5.14.noarch.rpm"
RPM_HASH = "ac603973ecf4c340c206f5664df1d436d05f04fd4fd7bac33843341eaad07114e9e19f529fe9a8750d935d65ec276f20b4eb5db01fd6e8ceea263bd286eaa010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-colander \
python310-colander \
python3dist-colander"

RDEPENDS:${PN} += "python-abi \
python310-iso8601 \
python310-translationstring"

inherit rpm
