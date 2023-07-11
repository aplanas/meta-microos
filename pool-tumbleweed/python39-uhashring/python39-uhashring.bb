SUMMARY = "Full featured consistent hashing python library compatible with ketama"
DESCRIPTION = "Full featured consistent hashing python library compatible with ketama."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "python39-uhashring-2.3-1.3.noarch.rpm"
RPM_HASH = "36af0ce8dbc01ce7ea72ae565cef6de6e62317601fb7168f66ce4bc3594f48275a091739e2d434c34f3856b7e13be36d47ce45f343cd078e2f81c762663402f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-uhashring \
python39-uhashring \
python3dist-uhashring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
