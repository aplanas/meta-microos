SUMMARY = "Header files for development with PackageKit"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools (with manual pages) needed to \
compile and link applications using PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-devel-1.2.5-9.4.aarch64.rpm"
RPM_HASH = "624abebadf0389298f9e07f02033dc7fbe1a055f886f1e12f84750c3ff8d4c04a75e0bc290d08a09d1a5efdae14b3184d496b701febdb224f32e380aad27b26e"

RPROVIDES:${PN} += "PackageKit-devel \
libpk-backend-test-fail.so \
libpk-backend-test-nop.so \
libpk-backend-test-spawn.so \
libpk-backend-test-succeed.so \
libpk-backend-test-thread.so"

RDEPENDS:${PN} += "/usr/bin/sh \
PackageKit \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpackagekit-glib2-devel \
libpackagekit-glib2.so.18"

inherit rpm
