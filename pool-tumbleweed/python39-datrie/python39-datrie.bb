SUMMARY = "Trie data structure for Python"
DESCRIPTION = "A trie data structure for Python (2.x and 3.x). Uses libdatrie."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "python39-datrie-0.8.2-3.13.aarch64.rpm"
RPM_HASH = "59346e0bf6632baebd295fffb0b27431801be8a2a8eb1de138064403c13487ce037b5c68556d9f83ddf1265d33bb0e56183862382a2034b6479b520441be8965"

RPROVIDES:${PN} += "python3.9dist-datrie \
python39-datrie \
python3dist-datrie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
