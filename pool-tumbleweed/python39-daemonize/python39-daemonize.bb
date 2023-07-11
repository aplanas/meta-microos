SUMMARY = "Python module to launch code as a daemon process"
DESCRIPTION = "daemonize is a library for writing system daemons in Python."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python39-daemonize-2.5.0-4.3.noarch.rpm"
RPM_HASH = "62055fa1beacb06b2a8f2e9bf8b81c680b39a7110ca94b7e11e10bc4a1a37c5a6154505c2e3d08bc13c1902afe1da34aff3c17f33ba1f6e04b2b6078a5feea80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-daemonize \
python39-daemonize \
python3dist-daemonize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
