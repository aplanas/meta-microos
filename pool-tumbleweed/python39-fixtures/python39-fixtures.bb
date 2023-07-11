SUMMARY = "Fixtures, reusable state for writing clean tests and more"
DESCRIPTION = "Fixtures defines a Python contract for reusable state / support logic, \
primarily for unit testing. Helper and adaption logic is included to make it \
easy to write your own fixtures using the fixtures contract. Glue code is \
provided that makes using fixtures that meet the Fixtures contract in unittest \
compatible test cases easy and straight forward."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python39-fixtures-4.1.0-1.3.noarch.rpm"
RPM_HASH = "197de3a991aedae5de46affc438fd530b6249d335d20e5f6a2202c9e7964fe7da7baf7d65b3687f0673b9063beff48c565368020a084bea6053ddbfdd93e82df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fixtures \
python39-fixtures \
python3dist-fixtures"

RDEPENDS:${PN} += "python-abi \
python39-extras \
python39-pbr \
python39-testtools"

inherit rpm
