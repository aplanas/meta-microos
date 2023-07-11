SUMMARY = "A lightweight, object-oriented Python state machine implementation"
DESCRIPTION = "The transitions package makes it convenient and relatively easy to define and \
implement FSMs (finite state machines) in python."
LICENSE = "MIT"

PV = "0.8.10"

RPM_NAME = "python310-transitions-0.8.10-2.8.noarch.rpm"
RPM_HASH = "5109a62cbae0d522af72d8fa068cbe071f98c463a4195cbc54e6be8e875ea5979f1bc4150c67881cb09c2c03f5e40fbb31c3f4bb8685bed2bff25276ea2acdb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-transitions \
python310-transitions \
python3dist-transitions"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
