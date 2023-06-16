SUMMARY = "Command-line user interface for Octave"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
This package contains the command-line user interface."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.0"

RPM_NAME = "octave-cli-8.2.0-1.1.aarch64.rpm"
RPM_HASH = "07e8c532755051d62273f82961e3809fcb06db75b650cc8c51801a662cc7b62be1e68ce017d966bd65549999d2c9dad28a3fa3010851dc7b32f7051578ac6c6b"

RPROVIDES:${PN} += "config-octave-cli \
liboctave.so.10 \
liboctinterp.so.11 \
octave-cli"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libGraphicsMagick++-Q16.so.12 \
libGraphicsMagick-Q16.so.3 \
libX11.so.6 \
libamd.so.2 \
libarpack.so.2 \
libbz2.so.1 \
libc.so.6 \
libccolamd.so.2 \
libcholmod.so.3 \
libcolamd.so.2 \
libcurl.so.4 \
libcxsparse.so.3 \
libfftw3-threads.so.3 \
libfftw3.so.3 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libfltk-gl.so.1.3 \
libfltk.so.1.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libgl2ps.so.1 \
libglpk.so.40 \
libgomp.so.1 \
libhdf5.so.200 \
libm.so.6 \
libopenblas.so.0 \
libpcre.so.1 \
libportaudio.so.2 \
libqhull-r.so.8.0 \
libqrupdate.so.1 \
libreadline.so.8 \
libsndfile.so.1 \
libspqr.so.2 \
libstdc++.so.6 \
libsuitesparseconfig.so.5 \
libsundials-ida.so.6 \
libsundials-ida6 \
libsundials-sunlinsol4-3-0 \
libsundials-sunlinsolklu.so.4.3.0 \
libumfpack.so.5 \
libz.so.1 \
makeinfo \
update-alternatives"

inherit rpm
