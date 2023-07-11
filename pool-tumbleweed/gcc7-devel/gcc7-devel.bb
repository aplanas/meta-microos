SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-devel-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "00c68c77f01c0aabf8bf65bd0c2baf0b688a005f73ca256243fd03d18781bfa2fad82ac729178de75d3ac6e81ebac28602bc5ddc435be48fb5a5aa4de38daf16"

RPROVIDES:${PN} += "gcc7-devel"

RDEPENDS:${PN} += "gcc7 \
gmp-devel \
libc.so.6 \
mpc-devel"

inherit rpm
