SUMMARY = "Userspace library for the Netfilter Conntrack Helper extension"
DESCRIPTION = "This library provides the programming interface (API) to the \
Netfilter userspace helper infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "libnetfilter_cthelper0-1.0.1-1.5.aarch64.rpm"
RPM_HASH = "8a53835e8c1ad8523c093eeb8b51ff79aab9301e69f58ccecb0fad779af0bbfb6e116a53c9f09e836b4a3ba1049c7b34677b76b39a99448af59c13942cdeb408"

RPROVIDES:${PN} += "libnetfilter_cthelper.so.0()(64bit) \
libnetfilter_cthelper.so.0(LIBNETFILTER_CTHELPER_1.0)(64bit) \
libnetfilter_cthelper0 \
libnetfilter_cthelper0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmnl.so.0()(64bit) \
libmnl.so.0(LIBMNL_1.0)(64bit)"

inherit rpm
