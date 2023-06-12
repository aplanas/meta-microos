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

PV = "4.5.0+g613.8e4a5e15"

RPM_NAME = "libxmp-devel-4.5.0+g613.8e4a5e15-1.4.aarch64.rpm"
RPM_HASH = "af83dc3af7149b777b931d4d98c75211fada4dee41a70b37fff3845d2c2f1d6be4bd878fbfd1aeb6cff183112a6abae094743fe019353148567ae65b38fcbb6f"

RPROVIDES:${PN} += "libxmp-devel \
libxmp-devel(aarch-64) \
pkgconfig(libxmp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmp4"

inherit rpm
