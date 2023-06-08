SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-devel-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "4d4960f8ef412e3d3dbbe48550cd7f1d870f80d2237038edd479d91c924d1ba90715c350f79e4952cf74f7a8dc995555a1683a61d7672185f5a6caa8543a3364"

RPROVIDES:${PN} += "fftw-devel fftw3-devel fftw3-devel(aarch-64) pkgconfig(fftw3) pkgconfig(fftw3f) pkgconfig(fftw3l)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config glibc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfftw3-3 libfftw3.so.3()(64bit) libfftw3_threads.so.3()(64bit) libfftw3f.so.3()(64bit) libfftw3f_threads.so.3()(64bit) libfftw3l.so.3()(64bit) libfftw3l_threads.so.3()(64bit)"

inherit rpm
