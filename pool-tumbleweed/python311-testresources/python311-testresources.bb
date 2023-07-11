SUMMARY = "A pyunit extension for managing expensive test resources"
DESCRIPTION = "testresources: extensions to python unittest to allow declarative use \
of resources by test cases."
LICENSE = "(Apache-2.0 | BSD-3-Clause) & GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python311-testresources-2.0.1-7.3.noarch.rpm"
RPM_HASH = "964be2dc2b3b41412715182f41ae3d9907c83c30e2f8920ec49491d8076b99ce466d986c856836cf7ec7c72cb954e7d0eb318a455d44431a85eef1c4c4d4c0f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testresources \
python3.11dist-testresources \
python311-testresources \
python3dist-testresources"

RDEPENDS:${PN} += "python-abi \
python311-pbr"

inherit rpm
