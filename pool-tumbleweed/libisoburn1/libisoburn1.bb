SUMMARY = "Frontend for libburn and libisofs"
DESCRIPTION = "Libisoburn is a frontend for libraries libburn and libisofs which enables \
creation and expansion of ISO-9660 filesystems on all CD/DVD/BD media supported \
by libburn. This includes media like DVD+RW, which do not support multi-session \
management on media level and even plain disk files or block devices. Since it \
specializes on data files in ISO-9660 filesystem images it is not suitable for \
audio (CD-DA) or any other CD layout which does not entirely consist of \
ISO-9660 sessions."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "libisoburn1-1.5.6-1.1.aarch64.rpm"
RPM_HASH = "ac451493507542b27add0fcde6ed393311e7f500e70f82e5eb84be41871cdf0bf64c153fe284ff371f2dc49d6671b8d923a18a95af8e4854c408f0b93144588e"

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
