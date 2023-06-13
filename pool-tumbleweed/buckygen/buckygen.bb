SUMMARY = "Generator for nonisomorphic fullerenes"
DESCRIPTION = "Buckygen is a program for the efficient generation of all \
nonisomorphic fullerenes. These are triangulations where all vertices \
have degree 5 or 6. Or if the dual representation is used: cubic \
plane graphs where all faces are pentagons or hexagons."
LICENSE = "GPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "buckygen-1.1-1.11.aarch64.rpm"
RPM_HASH = "f42ca8bf61117c29c70eef19628a773254ff5edc21bd03083002b33d5aaa19cc552392e16bf031ad0b847b31e7e7df3333f9f46be25b1607da1444735eec2a22"

RPROVIDES:${PN} += "buckygen \
buckygen(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
