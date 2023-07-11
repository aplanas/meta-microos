SUMMARY = "Development files for libraw"
DESCRIPTION = "LibRaw is a library for reading RAW files obtained from digital photo \
cameras (CRW/CR2, NEF, RAF, DNG, and others). \
 \
LibRaw is based on the source codes of the dcraw utility, where part of \
drawbacks have already been eliminated and part will be fixed in future."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "0.21.1"

RPM_NAME = "libraw-devel-0.21.1-2.2.aarch64.rpm"
RPM_HASH = "d4471c1cec3643bda57c0c6279aba23297cdaf607a88e87a4f87ddc9a1e642c449f39ab9cffdec355a59793229d40342616853e9b03cb496926f3f7daa65bfe9"

RPROVIDES:${PN} += "libraw-devel \
pkgconfig-libraw \
pkgconfig-libraw-r"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libraw23 \
pkgconfig-lcms2"

inherit rpm
