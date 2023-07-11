SUMMARY = "A library for automatically generating command line interfaces"
DESCRIPTION = "Python Fire is a library for automatically generating command line \
interfaces (CLIs) from a Python object."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "python39-fire-0.5.0-1.5.noarch.rpm"
RPM_HASH = "5b4fd7ce2271138ab93403c6a167eb500571d4a23b52f6a0efa71dc3945dc1148be906bcb96f4d253007cb6f706858924c4fac9b9fd69fa6dabecd19adb95bab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fire \
python39-fire \
python3dist-fire"

RDEPENDS:${PN} += "python-abi \
python39-six \
python39-termcolor"

inherit rpm
