SUMMARY = "Programs for solving certain tasks in mathematical crystallography"
DESCRIPTION = "Carat is a computer package which handles enumeration, \
construction, recognition and comparison problems for \
crystallographic groups up to dimension 6. The name CARAT itself \
is an acronym for Crystallographic AlgoRithms And Tables."
LICENSE = "GPL-2.0-only"

PV = "2.1b1+g132"

RPM_NAME = "carat-2.1b1+g132-1.1.aarch64.rpm"
RPM_HASH = "2c407fe245eb739a0b4f4d98d5aec2a3a5904fe6fd86fcc67b27ef35f851af3d7a16ae7992dc4f3699f54a769f99f38fe83b44115ad3cc5ca9dbd1c68726ffb6"

RPROVIDES:${PN} += "carat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
