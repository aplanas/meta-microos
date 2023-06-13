SUMMARY = "Module for determining appropriate platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate platform-specific dirs, e.g. a 'user data dir'."
LICENSE = "MIT"

PV = "3.5.1"

RPM_NAME = "python311-platformdirs-3.5.1-1.1.noarch.rpm"
RPM_HASH = "149aff52c7f1f4c91dd518d4a013dcd42dcda1b6b54d8a67a71db65e8e36873bff5b2b3a6ea4412eb602ed229cfdae2bcd2196cb31de2271402589c7a3a20bbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(platformdirs) \
python311-platformdirs \
python3dist(platformdirs)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
