SUMMARY = "A pyunit extension for managing expensive test resources"
DESCRIPTION = "testresources: extensions to python unittest to allow declarative use \
of resources by test cases."
LICENSE = "(Apache-2.0 | BSD-3-Clause) & GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python310-testresources-2.0.1-7.3.noarch.rpm"
RPM_HASH = "eaac57d6fbe5f869e238fa070c6dad8820361b21e9b6399deda44d48566c7dde872a9a6ef33339df3cd745ad00e9e6b651f6c9ed3d42cbcd372b34b244032127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-testresources \
python310-testresources \
python3dist-testresources"

RDEPENDS:${PN} += "python-abi \
python310-pbr"

inherit rpm
