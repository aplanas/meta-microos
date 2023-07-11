SUMMARY = "A lightweight, object-oriented Python state machine implementation"
DESCRIPTION = "The transitions package makes it convenient and relatively easy to define and \
implement FSMs (finite state machines) in python."
LICENSE = "MIT"

PV = "0.8.10"

RPM_NAME = "python311-transitions-0.8.10-2.8.noarch.rpm"
RPM_HASH = "d81dd884056706dee0171b8d86cbe8258513d0ee20016ef9c0ee8e213e103139f54e2485bb37a547d585a0980bcff51a3a8115e8f9c2b3fc597c35b817e45181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-transitions \
python3.11dist-transitions \
python311-transitions \
python3dist-transitions"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
