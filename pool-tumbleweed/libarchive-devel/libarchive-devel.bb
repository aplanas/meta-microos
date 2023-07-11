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

RPM_NAME = "libarchive-devel-3.6.2-1.5.aarch64.rpm"
RPM_HASH = "85aff0382137a4fd12a0e65d0c7645fac2fbd9a11b770bd1c25cf054cf765fe753a00f4b6299557fbfc65822946d0de024412e3c0cd4eca41ba1e447e92419dd"

RPROVIDES:${PN} += "libarchive-devel \
pkgconfig-libarchive"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libarchive13"

inherit rpm
