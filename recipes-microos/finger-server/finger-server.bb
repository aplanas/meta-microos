SUMMARY = "A Server for Showing User Information"
DESCRIPTION = "The finger daemon implements a simple protocol based on RFC1196 that \
provides an interface to the Name and Finger programs at several \
network sites. The program is supposed to return a friendly \
human-oriented status report on either the system at the moment or a \
particular person."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "finger-server-1.3-169.3.aarch64.rpm"
RPM_HASH = "72098aa9adb7ff72ced92f01713040921e8f4088b6eec3d6737afccc97394aa7085b060721a455740d0f737755de1354a7f9bcf52a30d99ec735d14a51e78120"

RPROVIDES:${PN} += "finger-server finger-server(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libnss_usrfiles2 netcfg systemd"

inherit rpm
