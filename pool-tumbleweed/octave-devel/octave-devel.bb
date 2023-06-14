SUMMARY = "Development files for Octave"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
This package contains all necessary include files and libraries needed \
to develop applications using Octave."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.0"

RPM_NAME = "octave-devel-8.2.0-1.1.aarch64.rpm"
RPM_HASH = "925ec710385c3be35e5e31e49359b56d8e680b16e55d595de51a2d4c3a79b8e44de16454beaeda48c452eff419fbde783f4ec719260f06c5920c2209360adaf3"

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
