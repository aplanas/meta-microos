SUMMARY = "GTK+ UVC Viewer and Capturer"
DESCRIPTION = "A GTK interface for capturing and viewing video from devices \
supported by the Linux UVC driver, although it should also work with \
any v4l2 compatible device."
LICENSE = "GPL-3.0-only"

PV = "2.0.8"

RPM_NAME = "libgviewrender-2_1-2-2.0.8-1.7.aarch64.rpm"
RPM_HASH = "17228dd999132772a1036577e81765b376c813d29091469d11fa486666c4fa67d77688c53ee798a4b4f83cc0df571498434586c6beef6ed9545829e9d70e149f"

RPROVIDES:${PN} += "libgviewrender-2.1.so.2()(64bit) \
libgviewrender-2_1-2 \
libgviewrender-2_1-2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
