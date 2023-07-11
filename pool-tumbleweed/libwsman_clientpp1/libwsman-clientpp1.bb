SUMMARY = "C++ bindings to the OpenWSMAN client library"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
 \
This subpackage provides a C++ API library for OpenWSMAN."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman_clientpp1-2.7.2-2.8.aarch64.rpm"
RPM_HASH = "a0323e8b01db040aa5fd79d586d963a81128ae09f483029524b3ae839c20848a5cec8d741c6e7b77c28eb56150e1d9fdb10ac5842571e99ddf2d32dc7136c727"

RPROVIDES:${PN} += "libwsman-clientpp.so.1 \
libwsman-clientpp1 \
openwsman-client"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
