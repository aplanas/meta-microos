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

RPM_NAME = "python310-pyrsistent-0.19.3-2.1.aarch64.rpm"
RPM_HASH = "960b30d54cedf984e42ebafac31cc0f1759414f6be954e4d729ea7ad0142fd4494669254df04b4d22f7e55529915f0fd28dee1c996ab935f74562ba9acbb88d1"

RPROVIDES:${PN} += "python3-pyrsistent \
python3.10dist(pyrsistent) \
python310-pyrsistent \
python310-pyrsistent(aarch-64) \
python3dist(pyrsistent)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
