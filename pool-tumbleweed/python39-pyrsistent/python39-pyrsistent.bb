SUMMARY = "Persistent, Functional, Immutable data structures"
DESCRIPTION = "Pyrsistent is a number of persistent collections \
(by some referred to as functional data structures). \
Persistent in  the sense that they are immutable. \
 \
All methods on a data structure that would normally \
mutate it instead return a new copy of the structure \
containing the requested updates. The original structure \
is left untouched."
LICENSE = "MIT"

PV = "0.19.3"

RPM_NAME = "python39-pyrsistent-0.19.3-2.3.aarch64.rpm"
RPM_HASH = "c00941855b78131a691121c2b3cfb15bf6f560ea4ff9b43d966b2a42d7769373a14915989513382df2685d1ea1f1df7d404cefd6677f3a4cc3728cf83d38a74a"

RPROVIDES:${PN} += "python3.9dist-pyrsistent \
python39-pyrsistent \
python3dist-pyrsistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
