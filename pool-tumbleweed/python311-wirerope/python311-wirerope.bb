SUMMARY = "The Way to Handle Bound Methods"
DESCRIPTION = "wirerope.rope.WireRope is the wrapper for callables. By wrapping a function \
with WireRope with a custom subclass of the wirerope.wire.Wire class, the \
wire object will be created by each function or bound method."
LICENSE = "BSD-2-Clause"

PV = "0.4.7"

RPM_NAME = "python311-wirerope-0.4.7-1.4.noarch.rpm"
RPM_HASH = "9bf516b2115e95ad3f2ff5554f0592e6e6b762e06f69c6fa97ed3cdb897e11b80b4185d33fb9347337542a6ddfca9f723e64262c78ed8b48c907aa8f06a2d4b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wirerope \
python3.11dist-wirerope \
python311-wirerope \
python3dist-wirerope"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
