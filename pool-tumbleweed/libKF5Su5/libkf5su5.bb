SUMMARY = "User interface for running shell commands with root privileges"
DESCRIPTION = "libkdesu provides functionality for building GUI front ends for \
(password asking) console mode programs. For example, kdesu and \
kdessh use it to interface with su and ssh respectively."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Su5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "5fbebd086aec06ef34670485f6817c1249dde1826a17d1e2aadaec83a511eb6142e27c7d3ded8a6ec44a7a377ff6b219819472b6221494f89e088ffea4748c2f"

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
