SUMMARY = "Trie data structure for Python"
DESCRIPTION = "A trie data structure for Python (2.x and 3.x). Uses libdatrie."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "python310-datrie-0.8.2-3.11.aarch64.rpm"
RPM_HASH = "3c31290d2445617f6faaf5f0f3b334005edc3d64bb272ec3ac9fd01721470d42bc82462200a5393965bfdc3cfdcd2b0f65f11420f724a4157fee7b1a28834d11"

RPROVIDES:${PN} += "python3-datrie \
python3.10dist(datrie) \
python310-datrie \
python310-datrie(aarch-64) \
python3dist(datrie)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
