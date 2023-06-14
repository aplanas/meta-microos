SUMMARY = "Fixtures, reusable state for writing clean tests and more"
DESCRIPTION = "Fixtures defines a Python contract for reusable state / support logic, \
primarily for unit testing. Helper and adaption logic is included to make it \
easy to write your own fixtures using the fixtures contract. Glue code is \
provided that makes using fixtures that meet the Fixtures contract in unittest \
compatible test cases easy and straight forward."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python311-fixtures-4.1.0-1.1.noarch.rpm"
RPM_HASH = "ef682395d3bbade158bce3a7f3782cd95008098801ec57867be8a8790b4b5fe97763c35757470e0828e1023a8af22462d72de0cf61fc4755ea2938f41cf1c338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-fixtures \
python311-fixtures \
python3dist-fixtures"

RDEPENDS:${PN} += "python-abi \
python311-extras \
python311-pbr \
python311-testtools"

inherit rpm
