SUMMARY = "Development files for the Blake2 library"
DESCRIPTION = "Development files for the Blake2 library \
 \
This package contains the development files."
LICENSE = "CC0-1.0"

PV = "0.98.1"

RPM_NAME = "libb2-devel-0.98.1-1.13.aarch64.rpm"
RPM_HASH = "fb7984ad4e9a76adf40b087f03a9e5d4c9572c738efe4fc286dc25f4fb09f63d9cb19650074a4f8802e3451bc55926121b5161f957c19a3fc36f922005500df9"

RPROVIDES:${PN} += "libb2-devel \
libb2-devel(aarch-64) \
pkgconfig(libb2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libb2-1"

inherit rpm
