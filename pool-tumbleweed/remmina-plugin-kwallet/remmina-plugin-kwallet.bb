SUMMARY = "Remmina plugin to support the KDE Wallet"
DESCRIPTION = "KDE Wallet plugin, that can be used instead of the GNOME Keyring"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-plugin-kwallet-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "9db5e02df7d18a8530a0719980cd3e82b8090c5ce3ff57f528194a3b04ce2c37fdef732820c8946f5d2bd0470509e81cfb6a2c2056c7be0d5e978250fc8a51f3"

RPROVIDES:${PN} += "remmina-plugin-kwallet \
remmina-plugin-kwallet(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Wallet.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
remmina"

inherit rpm
