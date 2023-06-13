SUMMARY = "The Way to Handle Bound Methods"
DESCRIPTION = "wirerope.rope.WireRope is the wrapper for callables. By wrapping a function \
with WireRope with a custom subclass of the wirerope.wire.Wire class, the \
wire object will be created by each function or bound method."
LICENSE = "BSD-2-Clause"

PV = "0.4.7"

RPM_NAME = "python311-wirerope-0.4.7-1.2.noarch.rpm"
RPM_HASH = "9fb220ea9e5c5f69f0f9a5ff9280fc55083722c0eabd1b9bf818c9e0c1a19780794140b53a93428f92a3143a159de634c03c3aac9030cbfde50b61b6e72240d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wirerope) \
python311-wirerope \
python3dist(wirerope)"

RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
