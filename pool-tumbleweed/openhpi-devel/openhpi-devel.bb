SUMMARY = "Development Files for HPI"
DESCRIPTION = "Contains additional files needed for a developer to create applications \
and/or middleware that use the Service Availability Forum's HPI \
specification."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "openhpi-devel-3.8.0.ge4631e8a-3.5.aarch64.rpm"
RPM_HASH = "3d4487cab66218acdcd324d012930bf7c495c8e8ab212e3eb9576b22966bc2636c157688498f7f797277c3378f1066269cf0101152ae59db21835c1f2110f0b2"

RPROVIDES:${PN} += "openhpi-devel \
pkgconfig-openhpi \
pkgconfig-openhpiutils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
OpenIPMI-devel \
bzip2 \
e2fsprogs-devel \
gdbm-devel \
glib2-devel \
glibc-devel \
libopenhpi4 \
libstdc++-devel \
libtool \
ncurses-devel \
net-snmp-devel \
pkgconfig-glib-2.0 \
pkgconfig-openssl \
popt-devel \
zlib-devel"

inherit rpm
