SUMMARY = "Python module to launch code as a daemon process"
DESCRIPTION = "daemonize is a library for writing system daemons in Python."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python39-daemonize-2.5.0-3.12.noarch.rpm"
RPM_HASH = "5c845cafecc4395e1eb4a53c79ddc44fb602a3a639d781c4c0c659f5b1cd510df78afc44ce5e8601d56edb326269c64af871b971b089f4a20a29e302f577b0cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-daemonize \
python39-daemonize \
python3dist-daemonize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
