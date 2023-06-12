SUMMARY = "Development files for libsbc1"
DESCRIPTION = "Development files for the SBC library"
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "sbc-devel-1.5-2.11.aarch64.rpm"
RPM_HASH = "9a2453db5a658a4c55b38a9b6e4f9089ad890c690f4512a28110bc54aaa405e4cf386e910e0de78440bd2e356c0a35c78935480b9d8345317fad400fbd103283"

RPROVIDES:${PN} += "pkgconfig(sbc) \
sbc-devel \
sbc-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsbc1"

inherit rpm
