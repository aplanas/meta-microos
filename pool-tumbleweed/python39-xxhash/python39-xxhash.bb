SUMMARY = "Python binding for xxHash"
DESCRIPTION = "xxhash is a Python binding for the xxHash library."
LICENSE = "BSD-2-Clause"

PV = "3.1.0"

RPM_NAME = "python39-xxhash-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "3b4e2502e74a928377b7a1644610c1b0b7da0b2dc5da3b6b6b0501dd75cd5035c5cc17069ac98d89904dd44f791e602024a791b8374876ad54c41aee918a3144"

RPROVIDES:${PN} += "python3.9dist-xxhash \
python39-xxhash \
python3dist-xxhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxxhash.so.0 \
python-abi"

inherit rpm
