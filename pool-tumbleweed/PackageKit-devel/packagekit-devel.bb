SUMMARY = "Header files for development with PackageKit"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools (with manual pages) needed to \
compile and link applications using PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-devel-1.2.5-9.3.aarch64.rpm"
RPM_HASH = "9f4a9565f350ebb28829fb94a3818a4271ddc05f3e09c35677e9a0cf3d082e30833e5210dc3befb0cd0f9825865eb9508d0873d50cd89f1d196aa84995384c20"

RPROVIDES:${PN} += "PackageKit-devel \
libpk-backend-test-fail.so \
libpk-backend-test-nop.so \
libpk-backend-test-spawn.so \
libpk-backend-test-succeed.so \
libpk-backend-test-thread.so"

RDEPENDS:${PN} += "/bin/sh \
PackageKit \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpackagekit-glib2-devel \
libpackagekit-glib2.so.18"

inherit rpm
