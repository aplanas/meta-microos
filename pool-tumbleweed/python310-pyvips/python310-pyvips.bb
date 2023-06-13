SUMMARY = "Python bindings for VIPS image processing library"
DESCRIPTION = "This package contains the Python bindings for the VIPS library."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python310-pyvips-2.2.1-1.3.noarch.rpm"
RPM_HASH = "6181354acd637cebf0224b13be28c494edfae59a02eea4f3bc591455be170513f937de04e1e933b7c7daf1179d8a3d9e5ff0bd04604c2c00bd359eb0dde6e7f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyvips \
python3.10dist(pyvips) \
python310-pyvips \
python3dist(pyvips)"

RDEPENDS:${PN} += "python(abi) \
python310-cffi"

inherit rpm
