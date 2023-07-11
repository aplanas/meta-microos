SUMMARY = "The Way to Handle Bound Methods"
DESCRIPTION = "wirerope.rope.WireRope is the wrapper for callables. By wrapping a function \
with WireRope with a custom subclass of the wirerope.wire.Wire class, the \
wire object will be created by each function or bound method."
LICENSE = "BSD-2-Clause"

PV = "0.4.7"

RPM_NAME = "python39-wirerope-0.4.7-1.4.noarch.rpm"
RPM_HASH = "2fdbfb6cc34badde77a7bd02f29b418139c284a41b5b0cc0c79392ad3e8f9735ceb7d4c8399aa8390fbed49c319d4ec21c109d29785c573c891da3dec3d5a871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wirerope \
python39-wirerope \
python3dist-wirerope"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
