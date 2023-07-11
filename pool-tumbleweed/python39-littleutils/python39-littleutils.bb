SUMMARY = "Small personal collection of python utility functions"
DESCRIPTION = "Small personal collection of python utility functions"
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python39-littleutils-0.2.2-2.2.noarch.rpm"
RPM_HASH = "afe36bd4d51f248ab6a79a5b1b670132fabe27519b8d0ac97d76c8de7e5cf0a8fdd89531b965f75fe6f9a9b6bc3d2464a6218a08c2704e940ef6f4939d4d6ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-littleutils \
python39-littleutils \
python3dist-littleutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
