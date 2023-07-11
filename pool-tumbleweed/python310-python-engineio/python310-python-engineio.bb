SUMMARY = "EngineIO server"
DESCRIPTION = "Python implementation of the Engine.IO realtime server."
LICENSE = "MIT"

PV = "4.3.4"

RPM_NAME = "python310-python-engineio-4.3.4-2.4.noarch.rpm"
RPM_HASH = "b4fa1eb37599a277f6760bd5d3e89c92a7e4d700604f9835d3f7c21e25cc6605839bf5abf77055d8abe8c9c0506c98148c432a41f61fd2e141ef3850f973c343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-engineio \
python310-python-engineio \
python3dist-python-engineio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
