SUMMARY = "Client nsswitch/pam/ssh integration for consuming kanidm"
DESCRIPTION = "A localhost resolver and libraries that allow a system to resolve posix \
identities to a kanidm instance."
LICENSE = "MPL-2.0"

PV = "1.1.0~alpha12~git0.bcdbb18"

RPM_NAME = "kanidm-unixd-clients-1.1.0~alpha12~git0.bcdbb18-1.2.aarch64.rpm"
RPM_HASH = "16b5ecdc38e1514982240e35abc2f8fd3608e1e6d2fcb97359e4adc8a7869ab370554abbcaefd5410782a422c3f95572a5f7350091f9c0e9d626813834f5f9fb"

RPROVIDES:${PN} += "kanidm-unixd-clients \
libnss-kanidm.so.2"

RDEPENDS:${PN} += "/usr/bin/sh \
kanidm-clients \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpam.so.0 \
libssl.so.3 \
libz.so.1"

inherit rpm
