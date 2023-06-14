SUMMARY = "Brave's adblock library in Python"
DESCRIPTION = "Python wrapper for Brave's adblocking library."
LICENSE = "Apache-2.0 | MIT"

PV = "0.6.0"

RPM_NAME = "python311-adblock-0.6.0-2.2.aarch64.rpm"
RPM_HASH = "ad952486b9c13f099c201b9f365a17dedcc4deda4d7b232f9eefd4e4b9b1a73f8045a233ee8afcba698026e93fca8aa6c88185d0606556bf9e7e515c9fcb6885"

RPROVIDES:${PN} += "python3.11dist-adblock \
python311-adblock \
python3dist-adblock"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
