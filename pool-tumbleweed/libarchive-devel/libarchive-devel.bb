SUMMARY = "Development files for libarchive"
DESCRIPTION = "Libarchive is a programming library that can create and read several \
different streaming archive formats, including most popular tar \
variants and several cpio formats. It can also write shar archives and \
read ISO-9660 CDROM images. The bsdtar program is an implementation of \
tar(1) that is built on top of libarchive. It started as a test \
harness, but has grown and is now the standard system tar for FreeBSD 5 \
and 6. \
 \
This package contains the development files."
LICENSE = "BSD-2-Clause"

PV = "3.7.0"

RPM_NAME = "libarchive-devel-3.7.0-1.1.aarch64.rpm"
RPM_HASH = "734cc910c50a0adbd8144041ce186bb961f21f10be6168cfa10e537b789c3d68e463a7c403f37eccbcb4dbacb694bd1adaa55af1c036c4badaf5c07f1933e578"

RPROVIDES:${PN} += "libarchive-devel \
pkgconfig-libarchive"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libarchive13"

inherit rpm
