SUMMARY = "Python module to launch code as a daemon process"
DESCRIPTION = "daemonize is a library for writing system daemons in Python."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python311-daemonize-2.5.0-4.3.noarch.rpm"
RPM_HASH = "9c20afb03571874827a56d7d10c12a8c5b6a8c8d2b6c23f03f5349b483d92446d6fa352796116038b41acd84f3f7400bc2ae10d49925414da5dad59923e4de84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-daemonize \
python3.11dist-daemonize \
python311-daemonize \
python3dist-daemonize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
