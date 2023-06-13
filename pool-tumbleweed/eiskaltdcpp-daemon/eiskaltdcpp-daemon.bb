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

RPM_NAME = "eiskaltdcpp-daemon-2.4.2-1.13.aarch64.rpm"
RPM_HASH = "2239e738eb12ba8b7208769907afafe1afc962f861113ef94415adc308517d2e50f3228cf766d4fdfc3347956c67903e4a22d435ecf2b92de79a042921281e53"

RPROVIDES:${PN} += "eiskaltdcpp-daemon \
eiskaltdcpp-daemon(aarch-64)"

RDEPENDS:${PN} += "eiskaltdcpp-common \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libeiskaltdcpp.so.2.4()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
