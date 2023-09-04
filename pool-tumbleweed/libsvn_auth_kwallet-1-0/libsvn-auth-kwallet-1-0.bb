SUMMARY = "KWallet support for Subversion"
DESCRIPTION = "Provides KWallet integration for Subversion"
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "libsvn_auth_kwallet-1-0-1.14.2-6.2.aarch64.rpm"
RPM_HASH = "dec561a5cbd9cc32a6563bda291d4c576801f5b14c5c420c3b4015c8d5ffbd86ca558e97f3fdef7205d04ac1083aa3e1fb23d601ad69e569c420c83b695017c8"

RPROVIDES:${PN} += "libsvn-auth-kwallet-1-0 \
libsvn-auth-kwallet-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Wallet.so.5 \
libQt5Core.so.5 \
libapr-1.so.0 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsvn-subr-1.so.0 \
subversion"

inherit rpm
