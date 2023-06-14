SUMMARY = "C++ bindings to the OpenWSMAN client library"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
 \
This subpackage provides a C++ API library for OpenWSMAN."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman_clientpp1-2.7.2-2.5.aarch64.rpm"
RPM_HASH = "f2d8bd335fc7c82e534b948a0694b60df14de2d9aeba235656c9c776a41ad062b9dc34fd735755568c41243a32c45888f947010776c35fba7f2968c810cc717e"

RPROVIDES:${PN} += "libwsman-clientpp.so.1 \
libwsman-clientpp1 \
openwsman-client"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
