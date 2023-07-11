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

RPM_NAME = "postfish-svn17492-16.35.aarch64.rpm"
RPM_HASH = "cc70b56cbf59fbf79d64097f3259323f14708da6f4c12c615a2c2c6ea2a9bbbb2577496b62840b3c9cf3e1a6f2b044b29e61035ac29ea64cc6a9213d8fa837ab"

RPROVIDES:${PN} += "postfish"

RDEPENDS:${PN} += "/usr/bin/sh \
fftw3 \
gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
