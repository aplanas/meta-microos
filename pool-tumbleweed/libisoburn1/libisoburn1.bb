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

RPM_NAME = "libisoburn1-1.5.4-1.11.aarch64.rpm"
RPM_HASH = "1c584ad24ae40c5a7e6cdc035032646418ce52b4648c18f8feaedf0d41189831ee43c344d8333ca44de60bb9b94a7e63f1e1814ae6233be4ba8bd28825be10e5"

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
