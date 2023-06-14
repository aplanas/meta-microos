SUMMARY = "Library for Reading DVD Video Images"
DESCRIPTION = "This package contains shared libraries for accessing DVD images (this \
package does not contain DeCSS algorithms)."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.3"

RPM_NAME = "libdvdread8-6.1.3-1.4.aarch64.rpm"
RPM_HASH = "2e3202aa03926eb4d7f68a8161b8ad5027bef8ee7b47a03da7aff175a9a199f7bed858c17e6ac7c53c3482c649b38996a2a3a537ad768165a83840365aeb15d4"

RPROVIDES:${PN} += "libdvdread \
libdvdread.so.8 \
libdvdread8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
