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

PV = "3.6.2"

RPM_NAME = "libarchive-devel-3.6.2-1.4.aarch64.rpm"
RPM_HASH = "12dcdf345df24d54c895569382ed9732815cdc9c3fa85e6e24e303aad42806a7bdc103aa54e20498778257d7836876542c8f468884a63add0e7f3858d8535459"

RPROVIDES:${PN} += "libarchive-devel \
libarchive-devel(aarch-64) \
pkgconfig(libarchive)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libarchive13"

inherit rpm
