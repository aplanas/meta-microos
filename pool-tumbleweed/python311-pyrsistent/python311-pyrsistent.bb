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

RPM_NAME = "python311-pyrsistent-0.19.3-2.3.aarch64.rpm"
RPM_HASH = "4ac333a9a4e0396536d01d35b02c81e6bee03e6095171eda8366896c7f93aec90d61e2d26c4875b2130240b60c3d2e31d83b54a3243db1cc2453ee9d6595ce7e"

RPROVIDES:${PN} += "python3-pyrsistent \
python3.11dist-pyrsistent \
python311-pyrsistent \
python3dist-pyrsistent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
