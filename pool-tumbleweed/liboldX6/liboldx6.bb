SUMMARY = "X version 10 backwards compatibility library"
DESCRIPTION = "This interface provides backwards compatibility for apps from X \
Version 10, which was the version of the X Window System from \
November 1985, replaced by X11 in September 1987."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "liboldX6-1.0.1-12.1.aarch64.rpm"
RPM_HASH = "c705bdffc08204503cdba6324cdb08e1306e98e71899b31efbc8b7cbf7778809b3b758749f1ddc643d727599720a9716633f86b68ebcc758e5e104ac6174cca5"

RPROVIDES:${PN} += "liboldX.so.6()(64bit) \
liboldX6 \
liboldX6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
