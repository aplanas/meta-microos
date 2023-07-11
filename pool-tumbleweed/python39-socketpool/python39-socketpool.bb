SUMMARY = "Python socket pool"
DESCRIPTION = "Socket pool is a socket pool that supports multiple factories and \
backends. It can be used by gevent, eventlet or any other library."
LICENSE = "MIT"

PV = "0.5.3"

RPM_NAME = "python39-socketpool-0.5.3-9.12.noarch.rpm"
RPM_HASH = "0f9b60c6fca4d1929718f7103c680ea5ebd233f4f235b646da4300f2ee213d5d405e11bd0d1233514ea3097d09bed86f7b2b0a06b628b84e5048c77976ad1264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-socketpool \
python39-socketpool \
python3dist-socketpool"

RDEPENDS:${PN} += "python-abi"

inherit rpm
