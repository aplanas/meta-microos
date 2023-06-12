SUMMARY = "Mobile telephony application development framework"
DESCRIPTION = "oFono provides a mobile telephony (GSM/UMTS) application development \
framework. It includes a high-level D-Bus API for use by telephony \
applications, and a low-level plug-in API for integration with other \
stacks, cellular modems, and storage back ends. The plug-in API \
functionality is modeled on public standards, in particular 3GPP TS \
27.007 'AT command set for User Equipment (UE)'."
LICENSE = "GPL-2.0-only"

PV = "1.34"

RPM_NAME = "ofono-1.34-1.7.aarch64.rpm"
RPM_HASH = "796dabbe8aef4ee00b03deaeb3a658fee1a7a30a74d331efaa23c7f88a7459dca724de0b4fc36285dd8c7494074bef9d5649c1ffd4116972d5b696f9d5e222a4"

RPROVIDES:${PN} += "config(ofono) \
ofono \
ofono(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libglib-2.0.so.0()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
systemd"

inherit rpm
