SUMMARY = "Utilities for OMEMO media sharing"
DESCRIPTION = "Utilities for OMEMO media sharing."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "omemo-utils-1.0.0-2.2.aarch64.rpm"
RPM_HASH = "8e43c9286e6e88b1c47264cd81a2a1b96914cabfc3ac5917f953f65d84337cc5af483c97e9d5f818ee8f69eeb970ad7d1270d21c7d0808f0c08c681c33d9e59b"

RPROVIDES:${PN} += "omemo-utils \
omemo-utils(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgcrypt.so.20()(64bit)"

inherit rpm
