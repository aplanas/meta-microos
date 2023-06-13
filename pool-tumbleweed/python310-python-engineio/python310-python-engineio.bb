SUMMARY = "EngineIO server"
DESCRIPTION = "Python implementation of the Engine.IO realtime server."
LICENSE = "MIT"

PV = "4.3.4"

RPM_NAME = "python310-python-engineio-4.3.4-2.2.noarch.rpm"
RPM_HASH = "02d4259b942c4c695e3c2e48a9fd52a79d2aa9bfa29b09fe35d50b7f6a7ee2f14c962eb9d8cf80f34dac519692815a021314b1ab612e0f88a33c9a47d145d493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-engineio \
python3.10dist(python-engineio) \
python310-python-engineio \
python3dist(python-engineio)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
