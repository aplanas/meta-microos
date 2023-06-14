SUMMARY = "System power status information in Python"
DESCRIPTION = "Python module that allows you to get power and battery status of the system."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python311-power-1.4-3.14.noarch.rpm"
RPM_HASH = "40836a5714688063af7b7c91bd71e176bab847e1fcd6abc826d4f2f027c25ed2b8e7c15f1c5878f0216cd59a7567fdb27b80454f3ea143eac01d5b6bd184e0a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-power \
python311-power \
python3dist-power"

RDEPENDS:${PN} += "python-abi"

inherit rpm
