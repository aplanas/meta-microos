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

RPROVIDES:${PN} += "application() \
application(kst2.desktop) \
kst \
kst(aarch-64) \
libkst2_dataobject_activitylevel.so()(64bit) \
libkst2_dataobject_bin.so()(64bit) \
libkst2_dataobject_chop.so()(64bit) \
libkst2_dataobject_convolution_convolve.so()(64bit) \
libkst2_dataobject_convolution_deconvolve.so()(64bit) \
libkst2_dataobject_correlation_autocorrelation.so()(64bit) \
libkst2_dataobject_correlation_crosscorrelation.so()(64bit) \
libkst2_dataobject_crossspectrum.so()(64bit) \
libkst2_dataobject_effectivebandwidth.so()(64bit) \
libkst2_dataobject_genericfilter.so()(64bit) \
libkst2_dataobject_interpolations_akima.so()(64bit) \
libkst2_dataobject_interpolations_akimaperiodic.so()(64bit) \
libkst2_dataobject_interpolations_cspline.so()(64bit) \
libkst2_dataobject_interpolations_csplineperiodic.so()(64bit) \
libkst2_dataobject_interpolations_linear.so()(64bit) \
libkst2_dataobject_interpolations_polynomial.so()(64bit) \
libkst2_dataobject_linefit.so()(64bit) \
libkst2_dataobject_lockin.so()(64bit) \
libkst2_dataobject_noiseaddition.so()(64bit) \
libkst2_dataobject_periodogram.so()(64bit) \
libkst2_dataobject_phase.so()(64bit) \
libkst2_dataobject_shift.so()(64bit) \
libkst2_dataobject_statistics.so()(64bit) \
libkst2_dataobject_syncbin.so()(64bit) \
libkst2_datasource_ascii.so()(64bit) \
libkst2_datasource_fitsimage.so()(64bit) \
libkst2_datasource_matlab.so()(64bit) \
libkst2_datasource_netcdf.so()(64bit) \
libkst2_datasource_qimagesource.so()(64bit) \
libkst2_datasource_sampledatasource.so()(64bit) \
libkst2_datasource_sourcelist.so()(64bit) \
libkst2_filters_butterworth_bandpass.so()(64bit) \
libkst2_filters_butterworth_bandstop.so()(64bit) \
libkst2_filters_butterworth_highpass.so()(64bit) \
libkst2_filters_butterworth_lowpass.so()(64bit) \
libkst2_filters_cumulativeaverage.so()(64bit) \
libkst2_filters_cumulativesum.so()(64bit) \
libkst2_filters_despike.so()(64bit) \
libkst2_filters_differentiation.so()(64bit) \
libkst2_filters_unwind.so()(64bit) \
libkst2_fits_exponential_unweighted.so()(64bit) \
libkst2_fits_exponential_weighted.so()(64bit) \
libkst2_fits_gaussian_unweighted.so()(64bit) \
libkst2_fits_gaussian_weighted.so()(64bit) \
libkst2_fits_gradient_unweighted.so()(64bit) \
libkst2_fits_gradient_weighted.so()(64bit) \
libkst2_fits_kneefrequency.so()(64bit) \
libkst2_fits_linear_unweighted.so()(64bit) \
libkst2_fits_linear_weighted.so()(64bit) \
libkst2_fits_lorentzian_unweighted.so()(64bit) \
libkst2_fits_lorentzian_weighted.so()(64bit) \
libkst2_fits_polynomial_unweighted.so()(64bit) \
libkst2_fits_polynomial_weighted.so()(64bit) \
libkst2_fits_sinusoid_unweighted.so()(64bit) \
libkst2_fits_sinusoid_weighted.so()(64bit) \
libkst2core.so.2()(64bit) \
libkst2math.so.2()(64bit) \
libkst2widgets.so.2()(64bit) \
mimehandler(application/x-kst)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcfitsio.so.10()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmatio.so.11()(64bit) \
libnetcdf_c++.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
