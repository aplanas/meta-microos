SUMMARY = "KWallet support for Subversion"
DESCRIPTION = "Provides KWallet integration for Subversion"
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "libsvn_auth_kwallet-1-0-1.14.2-5.3.aarch64.rpm"
RPM_HASH = "656908019dffd3206aef616596b458edb0f863d9166504ab049fa5cabf7168c9ea37d850b19ae26d129ba6e7ede35140c96630adb7c26755fea9f44b7997e3c4"

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
