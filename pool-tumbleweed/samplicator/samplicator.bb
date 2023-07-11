SUMMARY = "Tool to send copies of (UDP) datagrams to multiple receivers"
DESCRIPTION = "This program receives UDP datagrams on a given port, and resends \
those datagrams to a specified set of receivers. \
In addition, a sampling divisor N may be specified individually for each \
receiver, which will then only receive one in N of the received packets. \
Optional spoofing is also supported."
LICENSE = "GPL-2.0-only"

PV = "1.3.8rc1+git.20171112"

RPM_NAME = "samplicator-1.3.8rc1+git.20171112-3.8.aarch64.rpm"
RPM_HASH = "f4b1cc67002089c1665bff0e717729b6202dcf15585568c10850b4c223785c6d142e6f9a0bb3d6b3f4cbf979f887479cfe996c707e582db17ed9f247530cc9d6"

RPROVIDES:${PN} += "config-samplicator \
samplicator"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
