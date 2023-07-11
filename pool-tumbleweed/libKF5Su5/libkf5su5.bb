SUMMARY = "User interface for running shell commands with root privileges"
DESCRIPTION = "libkdesu provides functionality for building GUI front ends for \
(password asking) console mode programs. For example, kdesu and \
kdessh use it to interface with su and ssh respectively."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Su5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "002c428fb5de9bc3a5cde4e5581ddfb670f977ca77d3ace78fb5a572baddcbe4ed04e450e17250aa5f55ceb435a03dbc1878368e5896c9a955fbf6b03872bd20"

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
