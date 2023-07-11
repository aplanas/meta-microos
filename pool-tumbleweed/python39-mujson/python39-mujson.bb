SUMMARY = "Module that selects the fastest JSON functions available at import time"
DESCRIPTION = "A Python module that selects the fastest JSON functions available at \
import time."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python39-mujson-1.4-2.16.noarch.rpm"
RPM_HASH = "e44a51728502121e63b568d11b5157f2d2149dfa671a7ddea21ec52b87a44d21caf692a606dc0608c6205c549b44a41df97baf405f4148acec92d2d99f08a589"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mujson \
python39-mujson \
python3dist-mujson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
