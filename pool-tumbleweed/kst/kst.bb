SUMMARY = "Real-Time Data Viewing and Plotting Tool with Basic Data Analysis Functionality"
DESCRIPTION = "Kst is a data plotting and viewing program. Some of the features include: \
 \
- Robust plotting of live 'streaming' data \
- Powerful keyboard and mouse plot manipulation \
- Powerful plug-in and extension support \
- Large selection of built-in plotting and data manipulation functions, \
  such as histograms, equations, and power spectra \
- Color mapping and contour mapping capabilities for three-dimensional data \
- Monitoring of events and notification support \
- Built-in filtering and curve fitting capabilities \
- Convenient command line interface \
- Powerful graphical user interface"
LICENSE = "GPL-2.0-or-later"

PV = "2.0.8"

RPM_NAME = "kst-2.0.8-14.4.aarch64.rpm"
RPM_HASH = "79341582e9a5ff6159bdb0bd78bd9a7fa6d56c6240185b163c1de6ee467df07691351bd00581d078ee969df9187b08201d9430a87e060051aea7fab35ee253e8"

RPROVIDES:${PN} += "kst \
libkst2-dataobject-activitylevel.so \
libkst2-dataobject-bin.so \
libkst2-dataobject-chop.so \
libkst2-dataobject-convolution-convolve.so \
libkst2-dataobject-convolution-deconvolve.so \
libkst2-dataobject-correlation-autocorrelation.so \
libkst2-dataobject-correlation-crosscorrelation.so \
libkst2-dataobject-crossspectrum.so \
libkst2-dataobject-effectivebandwidth.so \
libkst2-dataobject-genericfilter.so \
libkst2-dataobject-interpolations-akima.so \
libkst2-dataobject-interpolations-akimaperiodic.so \
libkst2-dataobject-interpolations-cspline.so \
libkst2-dataobject-interpolations-csplineperiodic.so \
libkst2-dataobject-interpolations-linear.so \
libkst2-dataobject-interpolations-polynomial.so \
libkst2-dataobject-linefit.so \
libkst2-dataobject-lockin.so \
libkst2-dataobject-noiseaddition.so \
libkst2-dataobject-periodogram.so \
libkst2-dataobject-phase.so \
libkst2-dataobject-shift.so \
libkst2-dataobject-statistics.so \
libkst2-dataobject-syncbin.so \
libkst2-datasource-ascii.so \
libkst2-datasource-fitsimage.so \
libkst2-datasource-matlab.so \
libkst2-datasource-netcdf.so \
libkst2-datasource-qimagesource.so \
libkst2-datasource-sampledatasource.so \
libkst2-datasource-sourcelist.so \
libkst2-filters-butterworth-bandpass.so \
libkst2-filters-butterworth-bandstop.so \
libkst2-filters-butterworth-highpass.so \
libkst2-filters-butterworth-lowpass.so \
libkst2-filters-cumulativeaverage.so \
libkst2-filters-cumulativesum.so \
libkst2-filters-despike.so \
libkst2-filters-differentiation.so \
libkst2-filters-unwind.so \
libkst2-fits-exponential-unweighted.so \
libkst2-fits-exponential-weighted.so \
libkst2-fits-gaussian-unweighted.so \
libkst2-fits-gaussian-weighted.so \
libkst2-fits-gradient-unweighted.so \
libkst2-fits-gradient-weighted.so \
libkst2-fits-kneefrequency.so \
libkst2-fits-linear-unweighted.so \
libkst2-fits-linear-weighted.so \
libkst2-fits-lorentzian-unweighted.so \
libkst2-fits-lorentzian-weighted.so \
libkst2-fits-polynomial-unweighted.so \
libkst2-fits-polynomial-weighted.so \
libkst2-fits-sinusoid-unweighted.so \
libkst2-fits-sinusoid-weighted.so \
libkst2core.so.2 \
libkst2math.so.2 \
libkst2widgets.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libcfitsio.so.10 \
libgcc-s.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
libmatio.so.11 \
libnetcdf-c++.so.4 \
libstdc++.so.6"

inherit rpm
