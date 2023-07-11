SUMMARY = "Library for encoding variable length integer data"
DESCRIPTION = "varints are a common encoding for variable length integer data, \
used in libraries such as sqlite, protobuf, v8, and more."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-varint-1.0.2-1.13.noarch.rpm"
RPM_HASH = "873073e2c28dcd401e385d5960bcc5cabc37f5e0ebae3ee1818633d0ce30154fd4e2afb71febaa99a472d0a6c01f8856703cfaf75241ed91059c2d27dc66dd5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-varint \
python3.11dist-varint \
python311-varint \
python3dist-varint"

RDEPENDS:${PN} += "python-abi"

inherit rpm
