SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-devel-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "1314b374cbe4afca07eabeab1bc44f2fcc604caf86d278acd6cac79da4c290844a65148e674a1fd23dd8fa0ef6ea332f5d49d8eb70b6f4efc4dd04498107ed0c"

RPROVIDES:${PN} += "gcc7-devel"

RDEPENDS:${PN} += "gcc7 \
gmp-devel \
libc.so.6 \
mpc-devel"

inherit rpm
