SUMMARY = "ORM/ODM/framework-agnostic library to convert datatypes from/to Python types"
DESCRIPTION = "marshmallow is an ORM/ODM/framework-agnostic library for converting complex \
datatypes, such as objects, to and from native Python datatypes."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.19.0"

RPM_NAME = "python311-marshmallow-3.19.0-4.2.noarch.rpm"
RPM_HASH = "65eab1d960ad3341baef15f3e461f8e63e40ab2502b1ac49ef8ef021a8c1e21591a10098eab89b4004e63b8720158697958aa4fe32b1e2cbfd2c91b2d717faa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-marshmallow \
python3.11dist-marshmallow \
python311-marshmallow \
python3dist-marshmallow"

RDEPENDS:${PN} += "python-abi"

inherit rpm
