SUMMARY = "Utilities from libqb, an IPC library"
DESCRIPTION = "libqb is a library providing high performance client server reusable \
features. It provides logging, tracing, IPC, and polling."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.8+20230721.002171b"

RPM_NAME = "libqb-tools-2.0.8+20230721.002171b-1.1.aarch64.rpm"
RPM_HASH = "4ae39e9eae07d52ed1f131b5dfe2485dcf8e3f7a2999be88cb185a6ff0d426f992c807d6c350b2f46a8dccd08e3e7d9bcff6df6a66f828b6585d4d923975bc6a"

RPROVIDES:${PN} += "libqb-tools \
libqb0-/usr/sbin/qb-blackbox"

RDEPENDS:${PN} += "libc.so.6 \
libqb.so.100"

inherit rpm
