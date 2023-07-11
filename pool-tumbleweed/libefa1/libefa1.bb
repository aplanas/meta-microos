SUMMARY = "EFA runtime library"
DESCRIPTION = "This package contains the efa runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libefa1-45.0-1.2.aarch64.rpm"
RPM_HASH = "174ccb0408f2c512cee0013db252ecdfb5c59cf1045a0b0a6ebaa8a4483444fd80e4e1e8d8fb78e3d439d5a172af117ce8e4f93a83d29702216cd2afc86e3436"

RPROVIDES:${PN} += "libefa.so.1 \
libefa1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
