SUMMARY = "A pyunit extension for managing expensive test resources"
DESCRIPTION = "testresources: extensions to python unittest to allow declarative use \
of resources by test cases."
LICENSE = "(Apache-2.0 | BSD-3-Clause) & GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python311-testresources-2.0.1-8.1.noarch.rpm"
RPM_HASH = "8c65a5b5ee18b01daf61c8a6367e3178fd9df7702087e00f88062303933dbb4cd0d61cbfda579949f12b0f9ef9096402cded16e45225f99ab478f8c94ccef89a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testresources \
python3.11dist-testresources \
python311-testresources \
python3dist-testresources"

RDEPENDS:${PN} += "python-abi \
python311-pbr"

inherit rpm
