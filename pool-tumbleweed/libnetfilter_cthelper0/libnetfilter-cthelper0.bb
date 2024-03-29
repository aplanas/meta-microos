SUMMARY = "Userspace library for the Netfilter Conntrack Helper extension"
DESCRIPTION = "This library provides the programming interface (API) to the \
Netfilter userspace helper infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "libnetfilter_cthelper0-1.0.1-1.5.aarch64.rpm"
RPM_HASH = "8a53835e8c1ad8523c093eeb8b51ff79aab9301e69f58ccecb0fad779af0bbfb6e116a53c9f09e836b4a3ba1049c7b34677b76b39a99448af59c13942cdeb408"

RPROVIDES:${PN} += "libnetfilter-cthelper.so.0 \
libnetfilter-cthelper0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
