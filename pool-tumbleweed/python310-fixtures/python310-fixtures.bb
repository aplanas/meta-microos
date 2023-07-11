SUMMARY = "Fixtures, reusable state for writing clean tests and more"
DESCRIPTION = "Fixtures defines a Python contract for reusable state / support logic, \
primarily for unit testing. Helper and adaption logic is included to make it \
easy to write your own fixtures using the fixtures contract. Glue code is \
provided that makes using fixtures that meet the Fixtures contract in unittest \
compatible test cases easy and straight forward."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python310-fixtures-4.1.0-1.3.noarch.rpm"
RPM_HASH = "be700dcefac4c657bbdef39827a81da7bd858b46b8444a3e8f44972002c01ffbcd7da59a22679413ea2ae3a74a975307ef5ec09684d58b03b9bf55cb54b832fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fixtures \
python310-fixtures \
python3dist-fixtures"

RDEPENDS:${PN} += "python-abi \
python310-extras \
python310-pbr \
python310-testtools"

inherit rpm
