SUMMARY = "Development files for Octave"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
This package contains all necessary include files and libraries needed \
to develop applications using Octave."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.0"

RPM_NAME = "octave-devel-8.3.0-1.1.aarch64.rpm"
RPM_HASH = "48035b0f3fff11a74bdd4b74a313b90c22edab09b0b1c23ee346e16f3aa4127d4d75506ec2a49f41fcda6193f7ef08b8f95237103821bf63141b6329def78a4b"

RPROVIDES:${PN} += "octave-devel \
pkgconfig-octave \
pkgconfig-octinterp \
rpm-macro-octave \
rpm-macro-octave-api \
rpm-macro-octave-blas \
rpm-macro-octave-pkg-build \
rpm-macro-octave-pkg-install \
rpm-macro-octave-pkg-src \
rpm-macro-octave-pkg-test \
rpm-macro-octlib-dir \
rpm-macro-octpackages-dir \
rpm-macro-octskiptests \
rpm-macro-octsysw-settings"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fftw3-devel \
fftw3-threads-devel \
gcc-c++ \
gcc-fortran \
hdf5-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
make \
octave-cli \
openblas-devel"

inherit rpm
