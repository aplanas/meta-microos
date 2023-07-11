SUMMARY = "ORM/ODM/framework-agnostic library to convert datatypes from/to Python types"
DESCRIPTION = "marshmallow is an ORM/ODM/framework-agnostic library for converting complex \
datatypes, such as objects, to and from native Python datatypes."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.19.0"

RPM_NAME = "python39-marshmallow-3.19.0-4.2.noarch.rpm"
RPM_HASH = "c8f651dd6c0bb0472df03c28e4c56b91aceab449de826b08e626bd1949c5aee21e8253b4e2edddb0408ac1c7efe5a739963ae3801f54738ddf01a4062965d648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-marshmallow \
python39-marshmallow \
python3dist-marshmallow"

RDEPENDS:${PN} += "python-abi"

inherit rpm
