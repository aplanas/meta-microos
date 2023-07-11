SUMMARY = "Python binding for xxHash"
DESCRIPTION = "xxhash is a Python binding for the xxHash library."
LICENSE = "BSD-2-Clause"

PV = "3.1.0"

RPM_NAME = "python310-xxhash-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "5be52e0177913c429e3e1c095746426bb5a43cf32ef58d446157b30c8d63fcb04e193414773debcf1692aeb5205f5d664f06044941f1ba3c0678faa57953a297"

RPROVIDES:${PN} += "python3.10dist-xxhash \
python310-xxhash \
python3dist-xxhash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxxhash.so.0 \
python-abi"

inherit rpm
