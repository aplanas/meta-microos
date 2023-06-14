SUMMARY = "Metalink Library"
DESCRIPTION = "Libmetalink is a Metalink library written in C language. It is intended to \
provide the programs written in C to add Metalink functionality such as parsing \
Metalink XML files."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "libmetalink-devel-0.1.3-3.19.aarch64.rpm"
RPM_HASH = "25455d848591cbbe450eb3c9849e6e546152037a1fd60dead3190fed2490c4b438b18d177a5ea43318b878f0306ecb4dbc670794e42acb9a3e289f951dee108d"

RPROVIDES:${PN} += "libmetalink-devel \
pkgconfig-libmetalink"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmetalink3"

inherit rpm
