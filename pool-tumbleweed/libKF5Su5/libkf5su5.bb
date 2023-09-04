SUMMARY = "User interface for running shell commands with root privileges"
DESCRIPTION = "libkdesu provides functionality for building GUI front ends for \
(password asking) console mode programs. For example, kdesu and \
kdessh use it to interface with su and ssh respectively."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Su5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "ab7b59f45c224a7baa2dd2b3f14b5732a7ac8bdcd750e27f5be7bbc7c396f04df5be726723cd091332e8ba416479bcb367b618ffecf3c9647e4f146cfa7d1e1e"

RPROVIDES:${PN} += "libKF5Su.so.5 \
libKF5Su5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Pty.so.5 \
libQt5Core.so.5 \
libX11.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
