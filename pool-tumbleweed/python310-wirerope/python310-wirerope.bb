SUMMARY = "The Way to Handle Bound Methods"
DESCRIPTION = "wirerope.rope.WireRope is the wrapper for callables. By wrapping a function \
with WireRope with a custom subclass of the wirerope.wire.Wire class, the \
wire object will be created by each function or bound method."
LICENSE = "BSD-2-Clause"

PV = "0.4.7"

RPM_NAME = "python310-wirerope-0.4.7-1.2.noarch.rpm"
RPM_HASH = "abc97240990f404bbc285262aabbcaf6f2f085684ed022ca5984ca1ad16d49a462b265a9decb47ca293723d4e106c7d35df61562eb9246eb64ed7f983c9e2eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wirerope \
python3.10dist(wirerope) \
python310-wirerope \
python3dist(wirerope)"

RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
