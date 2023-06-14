SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libnutclientstub1-2.8.0-2.1.aarch64.rpm"
RPM_HASH = "ea59d3512ef6f2da8174980af4a3d2b7dda47fa355506df3da471d5d394a2974259a56a9eeef2ac5a3d8586ecdd68083c13e771cd0427168b08a75e2508b82be"

RPROVIDES:${PN} += "libnutclientstub.so.1 \
libnutclientstub1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnutclient.so.2 \
libstdc++.so.6"

inherit rpm
