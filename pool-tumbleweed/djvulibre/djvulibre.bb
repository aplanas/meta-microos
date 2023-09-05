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

RPM_NAME = "djvulibre-3.5.28-6.1.aarch64.rpm"
RPM_HASH = "dbdceb189e81c9ab345be23de19fbe7d5d7d790e0320be29c493623ceb37106c5d515125e40c539e0aa26d2214ee5684eceb8c82268c0abbee1811c005dfcf5c"

RPROVIDES:${PN} += "djvulibre"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdjvulibre.so.21 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
