SUMMARY = "Trie data structure for Python"
DESCRIPTION = "A trie data structure for Python (2.x and 3.x). Uses libdatrie."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "python311-datrie-0.8.2-3.13.aarch64.rpm"
RPM_HASH = "53b7b2e1bfa33b0161988d61d1a0ffa288ba243bfb75ae733d63ce697574046a448eb1f9e9e9608955334838390875d15315f435f958d11ab94150d56abe2279"

RPROVIDES:${PN} += "python3-datrie \
python3.11dist-datrie \
python311-datrie \
python3dist-datrie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
