SUMMARY = "A pyunit extension for managing expensive test resources"
DESCRIPTION = "testresources: extensions to python unittest to allow declarative use \
of resources by test cases."
LICENSE = "(Apache-2.0 | BSD-3-Clause) & GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python310-testresources-2.0.1-8.1.noarch.rpm"
RPM_HASH = "de6dd0231d3a377f2ca45b8a4acc9e8a346f235b97c41c2337dcb50193c2167e5f6132eb698abeb2710affa6e777314f9e880d9d7940ea89e15ce0028f1de34e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-testresources \
python310-testresources \
python3dist-testresources"

RDEPENDS:${PN} += "python-abi \
python310-pbr"

inherit rpm
