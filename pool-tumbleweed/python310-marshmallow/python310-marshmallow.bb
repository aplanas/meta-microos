SUMMARY = "ORM/ODM/framework-agnostic library to convert datatypes from/to Python types"
DESCRIPTION = "marshmallow is an ORM/ODM/framework-agnostic library for converting complex \
datatypes, such as objects, to and from native Python datatypes."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.19.0"

RPM_NAME = "python310-marshmallow-3.19.0-4.2.noarch.rpm"
RPM_HASH = "76e057aa5c1170e7fd8f75ac7830ddaa5686a3d034b2081d96f522d544f76dd038124bc699d9e3ca34bd6445949ca85126bc91196d806e30ec657039c2d3ddab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-marshmallow \
python310-marshmallow \
python3dist-marshmallow"

RDEPENDS:${PN} += "python-abi"

inherit rpm
