SUMMARY = "A digital audio post-processing tool"
DESCRIPTION = "The Postfish is a digital audio post-processing, restoration, filtering \
and mixdown tool. It works as a linear audio filter, much like a rack \
of analog effects. The first stage of the filter pipeline provides a \
bank of configurable per-channel processing filters for up to 32 input \
channels. The second stage provides mixdown of the processed input \
audio into a group of up to eight output channels. The third stage \
applies processing filters to the output group post-mixdown. \
 \
 \
 \
Authors: \
-------- \
    Monty \
    TD, Xiph.Org"
LICENSE = "GPL-2.0+"

PV = "svn17492"

RPM_NAME = "postfish-svn17492-16.34.aarch64.rpm"
RPM_HASH = "65a0ddfdebd19060ee05245241f8de02ac1d0e658569157fd333c3bfed945efa9f418587f0d0e105589885bfe405b78e657fcd9afc61865ee5a4dfcbb7805f09"

RPROVIDES:${PN} += "postfish \
postfish(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
fftw3 \
gtk2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfftw3f.so.3()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
