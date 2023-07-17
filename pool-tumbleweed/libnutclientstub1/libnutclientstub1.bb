SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libnutclientstub1-2.8.0-4.1.aarch64.rpm"
RPM_HASH = "bbe6c6674c8534f7a2e598db35b1d1378f4270a73ea6dbb6f48be5f8a91a11890240d667279cb8eb537a0e21215cc4cd7b3ac2883dcb39fda30846e8b18a4b85"

RPROVIDES:${PN} += "libnutclientstub.so.1 \
libnutclientstub1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnutclient.so.2 \
libstdc++.so.6"

inherit rpm
