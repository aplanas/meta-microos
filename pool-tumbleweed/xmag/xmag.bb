SUMMARY = "Screen magnifier"
DESCRIPTION = "xmag displays a magnified snapshot of a portion of an X11 screen."
LICENSE = "X11"

PV = "1.0.7"

RPM_NAME = "xmag-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "9c93c62e3eda43a295e9f986eb5971c2980199b83751046198159ddd5e0a33b3367d97def61239d2b7d17208ce0328ccdcb21a4d897409feeb0365249a65a89f"

RPROVIDES:${PN} += "application() \
application(xmag.desktop) \
xmag \
xmag(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
