SUMMARY = "Python 3 bindings for lilv"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications. \
This subpackage contains the Python 3 bindings for lilv."
LICENSE = "ISC"

PV = "0.24.20"

RPM_NAME = "python3-lilv-0.24.20-1.2.aarch64.rpm"
RPM_HASH = "dbd75c525173868303352f3fe670f0bf5937b3fc6a746ee7e996fc39614f1d6c4f3568ef8a985f8cf1b18a62746d6ed16470d365fddf61fcda1b05aa09f74b76"

RPROVIDES:${PN} += "python3-lilv"

RDEPENDS:${PN} += "liblilv-0-0 \
python-abi"

inherit rpm
