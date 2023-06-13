SUMMARY = "Client nsswitch/pam/ssh integration for consuming kanidm"
DESCRIPTION = "A localhost resolver and libraries that allow a system to resolve posix \
identities to a kanidm instance."
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha12~git0.bcdbb18"

RPM_NAME = "kanidm-unixd-clients-1.1.0~alpha12~git0.bcdbb18-1.1.aarch64.rpm"
RPM_HASH = "36bfcb271436e047bb5fef90382c4b5f2ef24462405326cb7090017aad5f901cc2bfbe3dcee463214de214601f4199132ad92e7213ff93a594f002cf694639f6"

RPROVIDES:${PN} += "kanidm-unixd-clients \
kanidm-unixd-clients(aarch-64) \
libnss_kanidm.so.2()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
kanidm-clients \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpam.so.0()(64bit) \
libssl.so.3()(64bit) \
libz.so.1()(64bit)"

inherit rpm
