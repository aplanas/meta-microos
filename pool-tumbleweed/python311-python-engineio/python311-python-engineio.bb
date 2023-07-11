SUMMARY = "EngineIO server"
DESCRIPTION = "Python implementation of the Engine.IO realtime server."
LICENSE = "MIT"

PV = "4.3.4"

RPM_NAME = "python311-python-engineio-4.3.4-2.4.noarch.rpm"
RPM_HASH = "a261fefbf392b47c98ceaa60cbb319168a122a289afde7ab4e117985920d999d0bc6616659794ca15a6af2384af2ee36d57555145e99dd8d2b6bfcd21616bbc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-engineio \
python3.11dist-python-engineio \
python311-python-engineio \
python3dist-python-engineio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
