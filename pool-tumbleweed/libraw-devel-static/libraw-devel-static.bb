SUMMARY = "Library for reading RAW files obtained from digital photo cameras"
DESCRIPTION = "LibRaw is a library for reading RAW files obtained from digital photo \
cameras (CRW/CR2, NEF, RAF, DNG, and others). \
 \
LibRaw is based on the source codes of the dcraw utility, where part of \
drawbacks have already been eliminated and part will be fixed in future. \
 \
This package contains static libraries that applications can use to build \
against LibRaw. LibRaw does not provide dynamic libraries."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "0.21.1"

RPM_NAME = "libraw-devel-static-0.21.1-2.2.aarch64.rpm"
RPM_HASH = "c53fb1ff44becf6430b32444224e1c03bed7dcd7a4f1aae925a0d3de1e2712aa4364adb146fa90f93c5059f2067ce6683057ee053069ba3760e405678ce4876f"

RPROVIDES:${PN} += "libraw-devel-static"

RDEPENDS:${PN} += "libraw-devel"

inherit rpm
