SUMMARY = "Client nsswitch/pam/ssh integration for consuming kanidm"
DESCRIPTION = "A localhost resolver and libraries that allow a system to resolve posix \
identities to a kanidm instance."
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha12~git0.bcdbb18"

RPM_NAME = "kanidm-unixd-clients-1.1.0~alpha12~git0.bcdbb18-1.1.aarch64.rpm"
RPM_HASH = "36bfcb271436e047bb5fef90382c4b5f2ef24462405326cb7090017aad5f901cc2bfbe3dcee463214de214601f4199132ad92e7213ff93a594f002cf694639f6"

RPROVIDES:${PN} += "kanidm-unixd-clients \
libnss-kanidm.so.2"

RDEPENDS:${PN} += "/bin/sh \
kanidm-clients \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpam.so.0 \
libssl.so.3 \
libz.so.1"

inherit rpm
