SUMMARY = "Module for determining appropriate platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate platform-specific dirs, e.g. a 'user data dir'."
LICENSE = "MIT"

PV = "3.5.1"

RPM_NAME = "python311-platformdirs-3.5.1-1.3.noarch.rpm"
RPM_HASH = "f3d221554b8881c6f986a4288d4cf5e701d8c73818264d670e3be90b9ae5043086405d98e27d35ce4567841662fc09e1e31401789831471733a0168e23bcf6dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-platformdirs \
python3.11dist-platformdirs \
python311-platformdirs \
python3dist-platformdirs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
