SUMMARY = "Utilities from libqb, an IPC library"
DESCRIPTION = "libqb is a library providing high performance client server reusable \
features. It provides logging, tracing, IPC, and polling."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.7+20230607.06c8641"

RPM_NAME = "libqb-tools-2.0.7+20230607.06c8641-1.1.aarch64.rpm"
RPM_HASH = "28bcb9e0769e60a632a3297adb9b2f32866286c09c6fd869513395acf11208ea0de5ad1994ab0dd48665e3b1b2aef69488f43a486da1268d4b1b051b0340c8d4"

RPROVIDES:${PN} += "libqb-tools \
libqb0-/usr/sbin/qb-blackbox"

RDEPENDS:${PN} += "libc.so.6 \
libqb.so.100"

inherit rpm
