SUMMARY = "System power status information in Python"
DESCRIPTION = "Python module that allows you to get power and battery status of the system."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python39-power-1.4-3.15.noarch.rpm"
RPM_HASH = "3491a509fb5fbeb08fe913fdb22cce2959f1e6f23e18c503c3b655b92ee4b11435999bc1a5391c820430cb9c877f671880ba5f4556dca34450c4038b166ac9fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-power \
python39-power \
python3dist-power"

RDEPENDS:${PN} += "python-abi"

inherit rpm
