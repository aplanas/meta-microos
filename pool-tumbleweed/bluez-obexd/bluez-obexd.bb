SUMMARY = "Object Exchange daemon for sharing content"
DESCRIPTION = "Object Exchange daemon for sharing content."
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "bluez-obexd-5.66-1.6.aarch64.rpm"
RPM_HASH = "4f25bbd910220b835e6d67a0f9f3a98b9ccb8e3fc08cd9d0507fb59b6a601a2ea724b5a20008cdef5c5b0d91b51bb26996f242d5a811320cd9b5a3b5ff9560a2"

RPROVIDES:${PN} += "bluez-obexd \
bluez-obexd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
bluez \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libglib-2.0.so.0()(64bit) \
libicalvcal.so.3()(64bit)"

inherit rpm
