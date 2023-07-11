SUMMARY = "Library for font configuration"
DESCRIPTION = "Fontconfig is a library for configuring and customizing font access. It \
contains two essential modules: the configuration module, which builds \
an internal configuration from XML files, and the matching module, \
which accepts font patterns and returns the nearest matching font."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "libfontconfig1-2.14.2-1.4.aarch64.rpm"
RPM_HASH = "1b506c548b95f8228e3c97c9870d8d2e3d90ec0ffa437e73f90e68622562138ae5a65e244ab44e546c5c0cf711e1762691059be72a44bc0f25ac5ada60ac9ad5"

RPROVIDES:${PN} += "libfontconfig.so.1 \
libfontconfig1"

RDEPENDS:${PN} += "/sbin/ldconfig \
fontconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libfreetype.so.6"

inherit rpm
