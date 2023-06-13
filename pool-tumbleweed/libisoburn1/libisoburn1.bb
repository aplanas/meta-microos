SUMMARY = "Frontend for libburn and libisofs"
DESCRIPTION = "Libisoburn is a frontend for libraries libburn and libisofs which enables \
creation and expansion of ISO-9660 filesystems on all CD/DVD/BD media supported \
by libburn. This includes media like DVD+RW, which do not support multi-session \
management on media level and even plain disk files or block devices. Since it \
specializes on data files in ISO-9660 filesystem images it is not suitable for \
audio (CD-DA) or any other CD layout which does not entirely consist of \
ISO-9660 sessions."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "libisoburn1-1.5.4-1.10.aarch64.rpm"
RPM_HASH = "1cf0765e0b278b877987f4b88362b18eb732c7bca646b5fc63f66c7bbe25ccd68c9734645276360dade3ed671f0b68ab93f6694e0ebc4142fb611c1111b9ba6c"

RPROVIDES:${PN} += "libisoburn.so.1()(64bit) \
libisoburn.so.1(LIBISOBURN1)(64bit) \
libisoburn1 \
libisoburn1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libburn.so.4()(64bit) \
libburn.so.4(LIBBURN4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libisofs.so.6()(64bit) \
libisofs.so.6(LIBISOFS6)(64bit) \
libjte.so.2()(64bit) \
libjte.so.2(LIBJTE1)(64bit) \
libjte.so.2(LIBJTE2)(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
