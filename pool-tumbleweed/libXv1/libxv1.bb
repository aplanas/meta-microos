SUMMARY = "X Video extension library"
DESCRIPTION = "The X Video Extension (Xv) extension provides support for video \
adaptors attached to an X display. It takes the approach that a \
display may have one or more video adaptors, each of which has one or \
more ports through which independent video streams pass. \
 \
Its use is to rescale video playback, do colorspace conversions, and \
change contrast, brightness and hue using video controller hardware \
acceleration."
LICENSE = "MIT"

PV = "1.0.12"

RPM_NAME = "libXv1-1.0.12-1.2.aarch64.rpm"
RPM_HASH = "ad11f282e34da62afa739c128409ddd330c725fdcd2ef1e533eb2287b306da1b03774bea9bcbfd0466465158eaed9320d9b526252e8c897d2cfdf72a716d04f7"

RPROVIDES:${PN} += "libXv.so.1()(64bit) \
libXv1 \
libXv1(aarch-64) \
xorg-x11-libXv"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
