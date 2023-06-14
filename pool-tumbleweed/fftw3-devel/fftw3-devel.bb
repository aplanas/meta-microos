SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-devel-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "4d4960f8ef412e3d3dbbe48550cd7f1d870f80d2237038edd479d91c924d1ba90715c350f79e4952cf74f7a8dc995555a1683a61d7672185f5a6caa8543a3364"

RPROVIDES:${PN} += "fftw-devel \
fftw3-devel \
pkgconfig-fftw3 \
pkgconfig-fftw3f \
pkgconfig-fftw3l"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
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
