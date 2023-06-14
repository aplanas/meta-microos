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

RPROVIDES:${PN} += "libisoburn.so.1 \
libisoburn1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libburn.so.4 \
libc.so.6 \
libisofs.so.6 \
libjte.so.2 \
libreadline.so.8"

inherit rpm
