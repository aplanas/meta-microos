SUMMARY = "EngineIO server"
DESCRIPTION = "Python implementation of the Engine.IO realtime server."
LICENSE = "MIT"

PV = "4.3.4"

RPM_NAME = "python39-python-engineio-4.3.4-2.2.noarch.rpm"
RPM_HASH = "ca819df8776562f3999c6075a1a0cf74d5d42700f686abd30a49ba67b4cba71ccb502cb095f580a76085cc8c1c1b9661e1cf494c9a2812919e022f558f78044f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-engineio) \
python39-python-engineio \
python3dist(python-engineio)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
