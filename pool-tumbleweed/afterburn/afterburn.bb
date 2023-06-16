SUMMARY = "A cloud provider agent"
DESCRIPTION = "Afterburn is a one-shot agent for cloud-like platforms which interacts with provider-specific metadata endpoints."
LICENSE = "Apache-2.0"

PV = "5.4.1"

RPM_NAME = "afterburn-5.4.1-1.1.aarch64.rpm"
RPM_HASH = "38ede3cfab66dd7bb0cc0b430ce47ebe017b8eb958c6cf5d7f42225fea6515454e73cc08a8d1a1c7a88c0ee1ef2bedb3431c3501a7afe41adb9359a32f93bd88"

RPROVIDES:${PN} += "afterburn"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3"

inherit rpm
