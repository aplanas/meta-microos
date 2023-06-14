SUMMARY = "KtoBLZCheck python-bindings"
DESCRIPTION = "This package contains the python-bindings for ktoblzcheck."
LICENSE = "LGPL-2.1-only"

PV = "1.53"

RPM_NAME = "python3-ktoblzcheck-1.53-1.4.aarch64.rpm"
RPM_HASH = "2e9903760165230b7b72a31c5be879ed77d1a15ce9409cc0e9c062835839ead7c77a4f042be2c9a4f63959f602c55f5c38d2b58a29ce29f981a417fd70927d24"

RPROVIDES:${PN} += "python3-ktoblzcheck"

RDEPENDS:${PN} += "ktoblzcheck \
libktoblzcheck1 \
python-abi"

inherit rpm
