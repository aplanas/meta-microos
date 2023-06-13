SUMMARY = "Python interface for libuv"
DESCRIPTION = "Python interface for libuv."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-pyuv-1.4.0-5.3.aarch64.rpm"
RPM_HASH = "3fa86c9cef1bf23736c107c1a7ea2314027003db388805726acd5ade50b7d4048b3ddc452819378b364707e7b1dce0b6133deae939836e23f0ddd6f60a51976a"

RPROVIDES:${PN} += "python3.9dist(pyuv) \
python39-pyuv \
python39-pyuv(aarch-64) \
python3dist(pyuv)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libuv.so.1()(64bit) \
python(abi)"

inherit rpm
