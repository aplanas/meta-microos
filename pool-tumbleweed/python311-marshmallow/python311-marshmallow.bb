SUMMARY = "ORM/ODM/framework-agnostic library to convert datatypes from/to Python types"
DESCRIPTION = "marshmallow is an ORM/ODM/framework-agnostic library for converting complex \
datatypes, such as objects, to and from native Python datatypes."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.19.0"

RPM_NAME = "python311-marshmallow-3.19.0-4.1.noarch.rpm"
RPM_HASH = "6131e7c67c604aa4fc2a2ac1722d86d51edf57bd32990fb9d047b23d4db426a4cf77b098c6d40c22fbe7d573c1d4ba7f66e86c975298620a20a559e8f697c034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-marshmallow \
python311-marshmallow \
python3dist-marshmallow"

RDEPENDS:${PN} += "python-abi"

inherit rpm
