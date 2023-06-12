SUMMARY = "DWARF processing library development files"
DESCRIPTION = "This package contains the development files for libdwarves, a library \
for processing DWARF, a debugging data format for ELF files."
LICENSE = "GPL-2.0-only"

PV = "1.25"

RPM_NAME = "libdwarves-devel-1.25-1.1.aarch64.rpm"
RPM_HASH = "62b408fb231deb4af2d4833715083978ae4c886f73796f3ab8979a52b5ac225b8879079093fe612d0a0a7300e55f4bbd109f12c6db3f12fc2f85c3859743eb28"

RPROVIDES:${PN} += "libdwarves-devel \
libdwarves-devel(aarch-64)"
RDEPENDS:${PN} += "libdwarves1"

inherit rpm
