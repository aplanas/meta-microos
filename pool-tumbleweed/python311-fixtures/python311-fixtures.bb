SUMMARY = "Fixtures, reusable state for writing clean tests and more"
DESCRIPTION = "Fixtures defines a Python contract for reusable state / support logic, \
primarily for unit testing. Helper and adaption logic is included to make it \
easy to write your own fixtures using the fixtures contract. Glue code is \
provided that makes using fixtures that meet the Fixtures contract in unittest \
compatible test cases easy and straight forward."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python311-fixtures-4.1.0-1.3.noarch.rpm"
RPM_HASH = "f2b7cb967e20fb355ce87955365afe60c504cddf8a1918458360b78beb95bea4b0c7698f5cadc8fd7a00a9b4d00ac154543af4d7fc77061f336fcd6a5e5edb1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fixtures \
python3.11dist-fixtures \
python311-fixtures \
python3dist-fixtures"

RDEPENDS:${PN} += "python-abi \
python311-extras \
python311-pbr \
python311-testtools"

inherit rpm
