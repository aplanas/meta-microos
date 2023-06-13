SUMMARY = "X11 font encoding library"
DESCRIPTION = "The libfontenc library is used by the Xorg server and other X font \
tools for handling fonts with different character set encodings."
LICENSE = "MIT"

PV = "1.1.7"

RPM_NAME = "libfontenc1-1.1.7-1.2.aarch64.rpm"
RPM_HASH = "a4b3fe84b6654aae4aa2214ddc29db5c20245ae4cff345704c94d911c0b72705da84428d2432565de0864aa68a48114dd5eceecf6058a50e58fdd47b80da4db2"

RPROVIDES:${PN} += "libfontenc.so.1()(64bit) \
libfontenc1 \
libfontenc1(aarch-64) \
xorg-x11-libfontenc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
