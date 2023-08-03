SUMMARY = "Python 3 bindings for lilv"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications. \
This subpackage contains the Python 3 bindings for lilv."
LICENSE = "ISC"

PV = "0.24.20"

RPM_NAME = "python3-lilv-0.24.20-2.1.aarch64.rpm"
RPM_HASH = "df57379cb83d7c5db85a2a13c688588675b3e416898af3a3d04657d9bc9a58edb81640abcb059ce2f0d88bdf08d924f2f601358eb03a7fa25626f13464545fb4"

RPROVIDES:${PN} += "python3-lilv"

RDEPENDS:${PN} += "liblilv-0-0 \
python-abi"

inherit rpm
