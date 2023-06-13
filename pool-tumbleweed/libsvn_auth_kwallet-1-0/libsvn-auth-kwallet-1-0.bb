SUMMARY = "KWallet support for Subversion"
DESCRIPTION = "Provides KWallet integration for Subversion"
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "libsvn_auth_kwallet-1-0-1.14.2-5.3.aarch64.rpm"
RPM_HASH = "656908019dffd3206aef616596b458edb0f863d9166504ab049fa5cabf7168c9ea37d850b19ae26d129ba6e7ede35140c96630adb7c26755fea9f44b7997e3c4"

RPROVIDES:${PN} += "libsvn_auth_kwallet-1-0 \
libsvn_auth_kwallet-1-0(aarch-64) \
libsvn_auth_kwallet-1.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libapr-1.so.0()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libsvn_subr-1.so.0()(64bit) \
subversion"

inherit rpm
