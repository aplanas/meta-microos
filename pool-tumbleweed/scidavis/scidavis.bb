SUMMARY = "An application for Scientific Data Analysis and Visualization"
DESCRIPTION = "SciDAVis is an interactive application for data analysis and \
publication-quality plotting. It has scriptability and can be extended. \
 \
SciDAVis is similar in its field of application to proprietary Windows \
applications like Origin and SigmaPlot as well as free applications like \
QtiPlot, Labplot and Gnuplot."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "1.22"

RPM_NAME = "scidavis-1.22-2.6.aarch64.rpm"
RPM_HASH = "ef3fdf74fe93722da5ba69c3f0e78cbf1fbf64218ac023af4d7850d926069dad6d006a24d0c61eec87e31e1187b9053cdfd112770fc5de0d1cd9682c80a90695"

RPROVIDES:${PN} += "libexp-saturation.so.1 \
libexplin.so.1 \
libfitRational0.so.1 \
libfitRational1.so.1 \
libplanck-wavelength.so.1 \
scidavis"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libQt3Support.so.4 \
libQtCore.so.4 \
libQtGui.so.4 \
libQtOpenGL.so.4 \
libQtSvg.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libgsl.so.23 \
libgslcblas.so.0 \
libm.so.6 \
libmuparser.so.2.2.6 \
libpthread.so.0 \
libqwt.so.5 \
libqwtplot3d.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
