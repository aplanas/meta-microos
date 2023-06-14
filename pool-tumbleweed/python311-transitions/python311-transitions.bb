SUMMARY = "A lightweight, object-oriented Python state machine implementation"
DESCRIPTION = "The transitions package makes it convenient and relatively easy to define and \
implement FSMs (finite state machines) in python."
LICENSE = "MIT"

PV = "0.8.10"

RPM_NAME = "python311-transitions-0.8.10-2.6.noarch.rpm"
RPM_HASH = "593452249bf1af7200dc9f365a04cb451ea4fe39df4c6dc7cdb3f477995df10fa38ace248ce8bf00a06be6b8e85e064a179f32f88cd37f66ce247ae1117fcea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-transitions \
python311-transitions \
python3dist-transitions"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
