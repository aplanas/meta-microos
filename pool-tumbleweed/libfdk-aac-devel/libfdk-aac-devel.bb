SUMMARY = "Development files for fdk-aac-free"
DESCRIPTION = "The libfdk-aac-devel package contains libraries and header files for \
developing applications that use fdk-aac-free."
LICENSE = "FDK-AAC"

PV = "2.0.0"

RPM_NAME = "libfdk-aac-devel-2.0.0-2.7.aarch64.rpm"
RPM_HASH = "ebd6de57141782934874ca159d372a53077187051ff181b52d94190e13b3fd801d7b6da5a7bd5be06a4e365df144a6f1e085fba86e3a46b1aa906bdcd9b6601a"

RPROVIDES:${PN} += "fdk-aac-free-devel \
fdk-aac-free-devel(aarch-64) \
libfdk-aac-devel \
libfdk-aac-devel(aarch-64) \
pkgconfig(fdk-aac)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdk-aac2(aarch-64)"

inherit rpm
