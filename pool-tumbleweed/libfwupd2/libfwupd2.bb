SUMMARY = "Allow session software to update device firmware"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.12"

RPM_NAME = "libfwupd2-1.8.12-1.3.aarch64.rpm"
RPM_HASH = "0f05b3daa108a5542b3792fc487947aa2c0c3431a01049ef743405711d88fa1b767b08bb0e3b4395645c596e47e37e1da4e1de9624ceccebd1170967b33ebd9c"

RPROVIDES:${PN} += "libfwupd.so.2()(64bit) \
libfwupd.so.2(LIBFWUPD_0.1.1)(64bit) \
libfwupd.so.2(LIBFWUPD_0.7.0)(64bit) \
libfwupd.so.2(LIBFWUPD_0.7.1)(64bit) \
libfwupd.so.2(LIBFWUPD_0.7.3)(64bit) \
libfwupd.so.2(LIBFWUPD_0.8.0)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.2)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.3)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.4)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.5)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.6)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.7)(64bit) \
libfwupd.so.2(LIBFWUPD_0.9.8)(64bit) \
libfwupd.so.2(LIBFWUPD_1.0.0)(64bit) \
libfwupd.so.2(LIBFWUPD_1.0.3)(64bit) \
libfwupd.so.2(LIBFWUPD_1.0.4)(64bit) \
libfwupd.so.2(LIBFWUPD_1.0.7)(64bit) \
libfwupd.so.2(LIBFWUPD_1.0.8)(64bit) \
libfwupd.so.2(LIBFWUPD_1.1.0)(64bit) \
libfwupd.so.2(LIBFWUPD_1.1.1)(64bit) \
libfwupd.so.2(LIBFWUPD_1.1.2)(64bit) \
libfwupd.so.2(LIBFWUPD_1.1.3)(64bit) \
libfwupd.so.2(LIBFWUPD_1.2.1)(64bit) \
libfwupd.so.2(LIBFWUPD_1.2.10)(64bit) \
libfwupd.so.2(LIBFWUPD_1.2.2)(64bit) \
libfwupd.so.2(LIBFWUPD_1.2.4)(64bit) \
libfwupd.so.2(LIBFWUPD_1.2.5)(64bit) \
libfwupd.so.2(LIBFWUPD_1.2.6)(64bit) \
libfwupd.so.2(LIBFWUPD_1.2.7)(64bit) \
libfwupd.so.2(LIBFWUPD_1.2.8)(64bit) \
libfwupd.so.2(LIBFWUPD_1.2.9)(64bit) \
libfwupd.so.2(LIBFWUPD_1.3.1)(64bit) \
libfwupd.so.2(LIBFWUPD_1.3.2)(64bit) \
libfwupd.so.2(LIBFWUPD_1.3.3)(64bit) \
libfwupd.so.2(LIBFWUPD_1.3.4)(64bit) \
libfwupd.so.2(LIBFWUPD_1.3.6)(64bit) \
libfwupd.so.2(LIBFWUPD_1.3.7)(64bit) \
libfwupd.so.2(LIBFWUPD_1.4.0)(64bit) \
libfwupd.so.2(LIBFWUPD_1.4.1)(64bit) \
libfwupd.so.2(LIBFWUPD_1.4.5)(64bit) \
libfwupd.so.2(LIBFWUPD_1.4.6)(64bit) \
libfwupd.so.2(LIBFWUPD_1.5.0)(64bit) \
libfwupd.so.2(LIBFWUPD_1.5.1)(64bit) \
libfwupd.so.2(LIBFWUPD_1.5.2)(64bit) \
libfwupd.so.2(LIBFWUPD_1.5.3)(64bit) \
libfwupd.so.2(LIBFWUPD_1.5.5)(64bit) \
libfwupd.so.2(LIBFWUPD_1.5.6)(64bit) \
libfwupd.so.2(LIBFWUPD_1.5.8)(64bit) \
libfwupd.so.2(LIBFWUPD_1.6.0)(64bit) \
libfwupd.so.2(LIBFWUPD_1.6.1)(64bit) \
libfwupd.so.2(LIBFWUPD_1.6.2)(64bit) \
libfwupd.so.2(LIBFWUPD_1.7.0)(64bit) \
libfwupd.so.2(LIBFWUPD_1.7.1)(64bit) \
libfwupd.so.2(LIBFWUPD_1.7.2)(64bit) \
libfwupd.so.2(LIBFWUPD_1.7.3)(64bit) \
libfwupd.so.2(LIBFWUPD_1.7.4)(64bit) \
libfwupd.so.2(LIBFWUPD_1.7.6)(64bit) \
libfwupd.so.2(LIBFWUPD_1.8.0)(64bit) \
libfwupd.so.2(LIBFWUPD_1.8.1)(64bit) \
libfwupd.so.2(LIBFWUPD_1.8.11)(64bit) \
libfwupd.so.2(LIBFWUPD_1.8.2)(64bit) \
libfwupd.so.2(LIBFWUPD_1.8.3)(64bit) \
libfwupd.so.2(LIBFWUPD_1.8.4)(64bit) \
libfwupd.so.2(LIBFWUPD_1.8.6)(64bit) \
libfwupd.so.2(LIBFWUPD_1.8.7)(64bit) \
libfwupd.so.2(LIBFWUPD_1.8.8)(64bit) \
libfwupd2 \
libfwupd2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
fwupd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.27)(64bit) \
libcurl.so.4()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjcat.so.1()(64bit) \
libjcat.so.1(LIBJCAT_0.1.0)(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit)"

inherit rpm
