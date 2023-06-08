SUMMARY = "Header files for development with PackageKit"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools (with manual pages) needed to \
compile and link applications using PackageKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-devel-1.2.5-9.3.aarch64.rpm"
RPM_HASH = "9f4a9565f350ebb28829fb94a3818a4271ddc05f3e09c35677e9a0cf3d082e30833e5210dc3befb0cd0f9825865eb9508d0873d50cd89f1d196aa84995384c20"

RPROVIDES:${PN} += "PackageKit-devel PackageKit-devel(aarch-64) libpk_backend_test_fail.so()(64bit) libpk_backend_test_nop.so()(64bit) libpk_backend_test_spawn.so()(64bit) libpk_backend_test_succeed.so()(64bit) libpk_backend_test_thread.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh PackageKit ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libpackagekit-glib2-devel libpackagekit-glib2.so.18()(64bit)"

inherit rpm
