SUMMARY = "Daemon for eiskaltdcpp"
DESCRIPTION = "This package contains only the EiskaltDC++ daemon, without any GUI. \
Support for control via JSON-RPC is enabled. The EiskaltDC++ CLI and \
Web UI programs can be used to control it. \
EiskaltDC++ Qt and GTK+ UI may be used for configuring the \
EiskaltDC++ daemon (they use the same settings from core library), \
but they should not be launched simultaneously. \
EiskaltDC++ is a program that uses the Direct Connect and Advanced \
Direct Connect protocols. It is compatible with DC++, AirDC++, \
FlylinkDC++ and other DC clients. EiskaltDC++ also interoperates with \
all common DC hub software."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-daemon-2.4.2-1.14.aarch64.rpm"
RPM_HASH = "6adf1d236069d8f065cd241a35f332cb24720bcfb81b1bd48729e2e02818dfd39f146f5f14965a4a8be40e52fcf499f7349399077fb266b4c63b4e67404aac4b"

RPROVIDES:${PN} += "eiskaltdcpp-daemon"

RDEPENDS:${PN} += "eiskaltdcpp-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeiskaltdcpp.so.2.4 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
