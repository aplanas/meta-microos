SUMMARY = "Development files for libxmp, a MOD/S3M/IT/etc. module player library"
DESCRIPTION = "libxmp is a module player library which supports many module formats, \
including MOD, S3M and IT. Possible applications for libxmp include \
standalone module players, module player plugins for other players, \
module information extractors, background music replayers for games \
and other applications, converters, etc. \
 \
This subpackage contains headers and library development files for \
libxmp."
LICENSE = "LGPL-2.1-only"

PV = "4.6.0"

RPM_NAME = "libxmp-devel-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "284490269a7d48d8f3f5a19c9926f260d835a26a7ed7eb6f2f231a1200ab7426883464908a0c3adcdd312d0e7cece444d5e79a6248b8acfa5b259c6a01aba98c"

RPROVIDES:${PN} += "libxmp-devel \
pkgconfig-libxmp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmp4"

inherit rpm
