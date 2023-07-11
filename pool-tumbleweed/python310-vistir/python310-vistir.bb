SUMMARY = "Utilities for filesystems, paths, projects, subprocesses, and more"
DESCRIPTION = "Miscellaneous utilities for dealing with filesystems, paths, projects, \
subprocesses, and more."
LICENSE = "ISC"

PV = "0.8.0"

RPM_NAME = "python310-vistir-0.8.0-1.3.noarch.rpm"
RPM_HASH = "9bd8827bb42259a96a4140754e51ee1cfdcf4ca4605beea4b42a13ae889345ec4e95f38a2a581e974e5c40964d2e45bea6e06989739e98d1ac6522c1d7324d13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vistir \
python310-vistir \
python3dist-vistir"

RDEPENDS:${PN} += "python-abi \
python310-colorama"

inherit rpm
