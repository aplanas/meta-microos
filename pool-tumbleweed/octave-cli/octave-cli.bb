SUMMARY = "Command-line user interface for Octave"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
This package contains the command-line user interface."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.0"

RPM_NAME = "octave-cli-8.2.0-1.1.aarch64.rpm"
RPM_HASH = "07e8c532755051d62273f82961e3809fcb06db75b650cc8c51801a662cc7b62be1e68ce017d966bd65549999d2c9dad28a3fa3010851dc7b32f7051578ac6c6b"

RPROVIDES:${PN} += "config(octave-cli) \
liboctave.so.10()(64bit) \
liboctinterp.so.11()(64bit) \
octave-cli \
octave-cli(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libGraphicsMagick++-Q16.so.12()(64bit) \
libGraphicsMagick-Q16.so.3()(64bit) \
libX11.so.6()(64bit) \
libamd.so.2()(64bit) \
libarpack.so.2()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libccolamd.so.2()(64bit) \
libcholmod.so.3()(64bit) \
libcolamd.so.2()(64bit) \
libcurl.so.4()(64bit) \
libcxsparse.so.3()(64bit) \
libfftw3.so.3()(64bit) \
libfftw3_threads.so.3()(64bit) \
libfftw3f.so.3()(64bit) \
libfftw3f_threads.so.3()(64bit) \
libfltk.so.1.3()(64bit) \
libfltk_gl.so.1.3()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libgl2ps.so.1()(64bit) \
libglpk.so.40()(64bit) \
libgomp.so.1()(64bit) \
libhdf5.so.200()(64bit) \
libm.so.6()(64bit) \
libopenblas.so.0()(64bit) \
libpcre.so.1()(64bit) \
libportaudio.so.2()(64bit) \
libqhull_r.so.8.0()(64bit) \
libqrupdate.so.1()(64bit) \
libreadline.so.8()(64bit) \
libsndfile.so.1()(64bit) \
libspqr.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libsuitesparseconfig.so.5()(64bit) \
libsundials_ida.so.6()(64bit) \
libsundials_ida6 \
libsundials_sunlinsol4_3_0 \
libsundials_sunlinsolklu.so.4.3.0()(64bit) \
libumfpack.so.5()(64bit) \
libz.so.1()(64bit) \
makeinfo \
update-alternatives"

inherit rpm
