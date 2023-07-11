SUMMARY = "Helpers for better testing"
DESCRIPTION = "Exam is a Python toolkit for writing better tests. \
It aims to remove a lot of the boiler plate testing \
code one often writes, while still following Python \
conventions and adhering to the unit testing interface."
LICENSE = "MIT"

PV = "0.10.6"

RPM_NAME = "python311-exam-0.10.6-5.8.noarch.rpm"
RPM_HASH = "312d88bf7020ed548eeee3e627dd013eb853bbbf7b0b7cc9f2322e7fb9a66e8bc668c99e2dcb4a77db9cabb79d51d258fa3e9d47ce3f6a9c2175402ae666b19b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-exam \
python3.11dist-exam \
python311-exam \
python3dist-exam"

RDEPENDS:${PN} += "python-abi"

inherit rpm
