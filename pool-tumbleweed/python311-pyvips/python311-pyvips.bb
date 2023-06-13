SUMMARY = "Python bindings for VIPS image processing library"
DESCRIPTION = "This package contains the Python bindings for the VIPS library."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python311-pyvips-2.2.1-1.3.noarch.rpm"
RPM_HASH = "6550f5055a9dd81c0ccfd4d7f96e2819fed7584ff79802b9344d2c3e59283fb7172e18489e9efe4438d92029d4dbe0e85eb364cde7df1a25c1d78312ab46f990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyvips) \
python311-pyvips \
python3dist(pyvips)"

RDEPENDS:${PN} += "python(abi) \
python311-cffi"

inherit rpm
