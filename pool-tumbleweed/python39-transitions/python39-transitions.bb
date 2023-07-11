SUMMARY = "A lightweight, object-oriented Python state machine implementation"
DESCRIPTION = "The transitions package makes it convenient and relatively easy to define and \
implement FSMs (finite state machines) in python."
LICENSE = "MIT"

PV = "0.8.10"

RPM_NAME = "python39-transitions-0.8.10-2.8.noarch.rpm"
RPM_HASH = "3d39628dd39b7e21937856c3aff078c2a84aa395a72d0002243469f603fde5458c7d33ccd171fac8f043658d8a1775b66732b20cb5b23857b761d4744cd341df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-transitions \
python39-transitions \
python3dist-transitions"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
