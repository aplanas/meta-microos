SUMMARY = "X11 protocol Composite extension client library"
DESCRIPTION = "The Composite extension causes a entire sub-tree of the window \
hierarchy to be rendered to an off-screen buffer. Applications can \
then take the contents of that buffer and do whatever they like. The \
off-screen buffer can be automatically merged into the parent window \
or merged by external programs, called compositing managers."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "libXcomposite1-0.4.6-1.2.aarch64.rpm"
RPM_HASH = "8ed1dcdcbfc78fc17653d2b4b288b1c5d219ace595150f56f14e901785e68d87c0ecb1a32377dc8ce7311ab738eaaa387bbd94f3f6c5a1d9f7fdebeb296cf9fd"

RPROVIDES:${PN} += "libXcomposite.so.1()(64bit) \
libXcomposite1 \
libXcomposite1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
