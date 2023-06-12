SUMMARY = "An Implementation of DjVu"
DESCRIPTION = "DjVu is a Web-centric format and software platform for distributing \
documents and images. DjVuLibre is an implementation of DjVu, \
including viewers, browser plug-ins, decoders, encoders, and \
utilities. DjVu can replace PDF, PS, TIFF, JPEG, and GIF for \
distributing scanned documents, digital documents, or high-resolution \
pictures. DjVu content is often smaller and consumes less client \
resources than competing formats."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.28"

RPM_NAME = "djvulibre-3.5.28-5.1.aarch64.rpm"
RPM_HASH = "7db461190ce780ed8decde29767945a70fdf9c5b5498ba9104e7372a0225c5cb50cfcc8ebe51797d1ddff9692c4a2d93073fd10c015da0e60872f92167c6b834"

RPROVIDES:${PN} += "djvulibre \
djvulibre(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdjvulibre.so.21()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
