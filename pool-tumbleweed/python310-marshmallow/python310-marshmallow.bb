SUMMARY = "ORM/ODM/framework-agnostic library to convert datatypes from/to Python types"
DESCRIPTION = "marshmallow is an ORM/ODM/framework-agnostic library for converting complex \
datatypes, such as objects, to and from native Python datatypes."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.19.0"

RPM_NAME = "python310-marshmallow-3.19.0-4.1.noarch.rpm"
RPM_HASH = "c133d8986dd880dbbc99860f82e866ced55950cbaac98ddbcdc8d28c0b04d015693417605204d381436943abbe8e22b4e3242fe97ee2c0cf6b26dfe8c9f2377d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-marshmallow \
python3.10dist-marshmallow \
python310-marshmallow \
python3dist-marshmallow"

RDEPENDS:${PN} += "python-abi"

inherit rpm
