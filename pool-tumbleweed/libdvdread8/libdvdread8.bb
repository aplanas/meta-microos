SUMMARY = "Library for Reading DVD Video Images"
DESCRIPTION = "This package contains shared libraries for accessing DVD images (this \
package does not contain DeCSS algorithms)."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.3"

RPM_NAME = "libdvdread8-6.1.3-1.5.aarch64.rpm"
RPM_HASH = "c185c64924293283002ae3ccfa0aec8fe6c88cad267350da31538615c3cc0f11dd06e0797b9aa79d5197e66eccfd64c45ed42a9fe8351ae9c8c361cca120e610"

RPROVIDES:${PN} += "libdvdread \
libdvdread.so.8 \
libdvdread8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
