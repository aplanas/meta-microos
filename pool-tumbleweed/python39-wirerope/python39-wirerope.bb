SUMMARY = "The Way to Handle Bound Methods"
DESCRIPTION = "wirerope.rope.WireRope is the wrapper for callables. By wrapping a function \
with WireRope with a custom subclass of the wirerope.wire.Wire class, the \
wire object will be created by each function or bound method."
LICENSE = "BSD-2-Clause"

PV = "0.4.7"

RPM_NAME = "python39-wirerope-0.4.7-1.2.noarch.rpm"
RPM_HASH = "6b7bb44490a5c620b3dc41bf368ef0e1836ed12bf976ee946860a7c867eae9552abc17a48950cbd41a5f39b78e1a0c35cf89c9a598575f160cdafd3d4f7433a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(wirerope) \
python39-wirerope \
python3dist(wirerope)"

RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
