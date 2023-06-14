SUMMARY = "User interface for running shell commands with root privileges"
DESCRIPTION = "libkdesu provides functionality for building GUI front ends for \
(password asking) console mode programs. For example, kdesu and \
kdessh use it to interface with su and ssh respectively."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Su5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "a3b03dd50c0b1689aa089f8b619505d49e56260025449ca44f6089333e6e73672b5d59316c0c20543bd8a9f16650e870b10e24a053e37384b2922c341ce8d5c9"

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
