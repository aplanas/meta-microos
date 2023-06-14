SUMMARY = "Fixtures, reusable state for writing clean tests and more"
DESCRIPTION = "Fixtures defines a Python contract for reusable state / support logic, \
primarily for unit testing. Helper and adaption logic is included to make it \
easy to write your own fixtures using the fixtures contract. Glue code is \
provided that makes using fixtures that meet the Fixtures contract in unittest \
compatible test cases easy and straight forward."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python39-fixtures-4.1.0-1.1.noarch.rpm"
RPM_HASH = "7957ec2ae871bfc1d65356b438aa87a13500c67fa94e105f7c5bbd9026b762fd5ff64be5cc162ee0c97404bef181fb55752919ea6d50457f7e07343367990812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fixtures \
python39-fixtures \
python3dist-fixtures"

RDEPENDS:${PN} += "python-abi \
python39-extras \
python39-pbr \
python39-testtools"

inherit rpm
