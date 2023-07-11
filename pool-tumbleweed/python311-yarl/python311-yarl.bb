SUMMARY = "Yet another URL library"
DESCRIPTION = "The module provides a URL class for url parsing and changing."
LICENSE = "Apache-2.0"

PV = "1.9.2"

RPM_NAME = "python311-yarl-1.9.2-2.1.aarch64.rpm"
RPM_HASH = "4a81c0417bcfdfa7b610c3185b1b09174da2d4dcf52c1f2389824a94d9fc8ab15297f71ca05bc17af7cc37ca98bfb73d34d09e15cc25c131d9e626295e9f5f28"

RPROVIDES:${PN} += "python3-yarl \
python3.11dist-yarl \
python311-yarl \
python3dist-yarl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-idna \
python311-multidict"

inherit rpm
