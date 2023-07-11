SUMMARY = "Network access framework for IPv4/IPv6"
DESCRIPTION = "net6 is a library which eases the development of network-based \
applications as it provides a TCP protocol abstraction for C++. It is \
portable to both the Windows and Unix-like platforms."
LICENSE = "LGPL-2.1+"

PV = "1.3.14"

RPM_NAME = "net6-devel-1.3.14-12.27.aarch64.rpm"
RPM_HASH = "304fe65d7ed295935977597a15adf8902728c478a055f1ae2c3d558e03dc8c0e973f348b00a70aeaf9b4b81a009f4644ca816eac8e1264207aa4fd756ea6a0d9"

RPROVIDES:${PN} += "net6-devel \
pkgconfig-net6-1.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnutls-devel \
libsigc++2-devel \
net6 \
pkgconfig-sigc++-2.0"

inherit rpm
