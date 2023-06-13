SUMMARY = "SIXEL encoder/decoder"
DESCRIPTION = "A C encoder/decoder implementation for DEC SIXEL graphics."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "libsixel1-1.10.3-1.7.aarch64.rpm"
RPM_HASH = "bd2c31878f08fd1ed6f9e00633a164d8192727ef57c49b74cc3e2b7849e27f6ce077245239a7f540ceb0184133ab77e890a5e1c041dc80b4b3094bbe1744e3c5"

RPROVIDES:${PN} += "libsixel.so.1()(64bit) \
libsixel1 \
libsixel1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgd.so.3()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit)"

inherit rpm
