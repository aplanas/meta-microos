SUMMARY = "Loudness measurement according to EBU-R128"
DESCRIPTION = "Ebumeter provides real-time level metering according to the EBU R-128 \
recommendation. The current release implements all features required \
by the EBU document except the oversampled peak level monitoring. \
ebumeter can only be used with JACK. \
 \
A separate command-line utility (ebur128) to measure audio files is \
provided as well."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "ebumeter-0.5.1-2.3.aarch64.rpm"
RPM_HASH = "4cd8cdc4de237503618656eea84460fccdd72a7cb491927067b655bbf1c9d225cd9328cfeaf777dcce1ba7819597aebb86091e40e03782c05cd6cdfb30fec6ca"

RPROVIDES:${PN} += "application() \
application(ebumeter.desktop) \
ebumeter \
ebumeter(aarch-64) \
ebur128"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclthreads.so.2()(64bit) \
libclxclient.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjack.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libzita-resampler.so.1()(64bit)"

inherit rpm
