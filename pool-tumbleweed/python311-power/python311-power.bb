SUMMARY = "System power status information in Python"
DESCRIPTION = "Python module that allows you to get power and battery status of the system."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python311-power-1.4-3.15.noarch.rpm"
RPM_HASH = "004764c65c17923da405b5069de377547498be476b9db15bd36cdb9902c063b53dff5c804c4084606b3d4f38e18013fa6ac1e01c1f15ad376cfcadb2ad7b17bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-power \
python3.11dist-power \
python311-power \
python3dist-power"

RDEPENDS:${PN} += "python-abi"

inherit rpm
