SUMMARY = "Python 3 bindings for lilv"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications. \
This subpackage contains the Python 3 bindings for lilv."
LICENSE = "ISC"

PV = "0.24.20"

RPM_NAME = "python3-lilv-0.24.20-1.1.aarch64.rpm"
RPM_HASH = "1788de425fc4c4a62062b612040b6f003559c5e4e0cbbc19e634ce9382322b167ed8832df0d0c9c83d31401efc42ce0bdc230c8a8cb674b650ea735d0fd2c4d0"

RPROVIDES:${PN} += "python3-lilv"

RDEPENDS:${PN} += "liblilv-0-0 \
python-abi"

inherit rpm
