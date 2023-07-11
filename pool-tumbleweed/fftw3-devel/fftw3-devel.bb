SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-devel-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "1a557ad66eb6fa30a71be2f99662779fcdeb5098db873c577f7091d05f9579bb02db4c2ee8e05df891fe300a22e6cd9d5f190b88ce88d029a981f5a17227272a"

RPROVIDES:${PN} += "fftw-devel \
fftw3-devel \
pkgconfig-fftw3 \
pkgconfig-fftw3f \
pkgconfig-fftw3l"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-3 \
libfftw3-threads.so.3 \
libfftw3.so.3 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libfftw3l-threads.so.3 \
libfftw3l.so.3"

inherit rpm
