SUMMARY = "KWallet support for Subversion"
DESCRIPTION = "Provides KWallet integration for Subversion"
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "libsvn_auth_kwallet-1-0-1.14.2-6.1.aarch64.rpm"
RPM_HASH = "f81d8c3aa556d2215fa7e5ed62f6778d9fe1e92999cb57e16f3d59c47ed7197ec9d4bbb4cece5ca7e2014d3d7d185f51be7a2898ed40dea26c5d8a6a462916e7"

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
