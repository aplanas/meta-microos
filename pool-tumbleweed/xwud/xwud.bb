SUMMARY = "Image displayer for X"
DESCRIPTION = "xwud allows X users to display in a window an image saved in a \
specially formatted dump file, such as produced by xwd."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "xwud-1.0.6-1.3.aarch64.rpm"
RPM_HASH = "24d557e695ea23b215d40a2e56456216d9583d9ee7a40c178a862096c88cfbb740647474cf366da9664043a281271cb266d94499b5c08ca65aff46aea208c41b"

RPROVIDES:${PN} += "xwud \
xwud(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
