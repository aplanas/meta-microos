SUMMARY = "All-in-one infinity value for Python"
DESCRIPTION = "All-in-one infinity value for Python. Can be compared to any object."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "python311-infinity-1.5-2.5.noarch.rpm"
RPM_HASH = "021898a9a5eefb1ce90542cd0c2fb939449de5aea88049a1466c567408a76df6508c508845588807526fe7f10f1dd68ddd63eda3644219ac4c4749d0771a172c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-infinity \
python3.11dist-infinity \
python311-infinity \
python3dist-infinity"

RDEPENDS:${PN} += "python-abi"

inherit rpm
