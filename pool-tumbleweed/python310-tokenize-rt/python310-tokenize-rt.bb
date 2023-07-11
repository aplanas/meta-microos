SUMMARY = "A wrapper around the stdlib `tokenize` which roundtrips"
DESCRIPTION = "A wrapper around the stdlib `tokenize` which roundtrips."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python310-tokenize-rt-4.2.1-1.11.noarch.rpm"
RPM_HASH = "b99af4e72f0de1466f6b21c6e24f918b9575ce6b96f725428379e964fb5f8dc6d5b0d2c4b9fab982886d93f1e0b041c5dd614077dbd975aeb0e0aa744d5798ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tokenize-rt \
python310-tokenize-rt \
python3dist-tokenize-rt"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
