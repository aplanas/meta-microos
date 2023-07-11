SUMMARY = "Python argument design patterns in a composable interface"
DESCRIPTION = "Python argument design patterns in a composable interface."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "python311-python-args-1.0.2-1.13.noarch.rpm"
RPM_HASH = "8db50ce0581825833d0d810823214e3082887002acbef4a064e4985d0dbdd91cb69b640522206bb162d30b1489c7d0e92b1031a5d6b593011700da7c81a2c027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-args \
python3.11dist-python-args \
python311-python-args \
python3dist-python-args"

RDEPENDS:${PN} += "python-abi"

inherit rpm
