SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libnutclientstub1-2.8.0-3.1.aarch64.rpm"
RPM_HASH = "a50548bcaa75bec53a6c72808ded1a59db22a261e1fa1c06b5bb2150a4df3516737fa4630ef48db9bf0a651e5ec81ee0757dfeccaf1a643fadfa9ba47854c1f9"

RPROVIDES:${PN} += "libnutclientstub.so.1 \
libnutclientstub1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnutclient.so.2 \
libstdc++.so.6"

inherit rpm
