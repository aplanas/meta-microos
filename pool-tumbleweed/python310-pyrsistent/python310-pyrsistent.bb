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

RPM_NAME = "python310-pyrsistent-0.19.3-2.3.aarch64.rpm"
RPM_HASH = "d6899fffe60c0d246c3b02935b999a01811aaa2c136a5d0ce5ad258a8de83a3cc641304dd386315e79689453c5ce794e9ae906157387531ac69a2b4f4c77a94a"

RPROVIDES:${PN} += "python3.10dist-pyrsistent \
python310-pyrsistent \
python3dist-pyrsistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
