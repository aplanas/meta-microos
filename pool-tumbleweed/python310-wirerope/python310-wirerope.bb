SUMMARY = "The Way to Handle Bound Methods"
DESCRIPTION = "wirerope.rope.WireRope is the wrapper for callables. By wrapping a function \
with WireRope with a custom subclass of the wirerope.wire.Wire class, the \
wire object will be created by each function or bound method."
LICENSE = "BSD-2-Clause"

PV = "0.4.7"

RPM_NAME = "python310-wirerope-0.4.7-1.4.noarch.rpm"
RPM_HASH = "d1705390135c43844880c60e472c71e80517bdb78c66e35b79c21608ec64e6f5ee1d024a092ac4bad845c80036d05ead5b987c4bafdbe919f3ea1b9776841c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wirerope \
python310-wirerope \
python3dist-wirerope"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
