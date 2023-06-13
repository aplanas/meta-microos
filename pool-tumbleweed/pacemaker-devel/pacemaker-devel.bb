SUMMARY = "Pacemaker development package"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The pacemaker-devel package contains headers and shared libraries \
for developing tools for Pacemaker."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.5+20230320.22590c566"

RPM_NAME = "pacemaker-devel-2.1.5+20230320.22590c566-1.1.aarch64.rpm"
RPM_HASH = "3e41314dc774f85f33f88f08c87cebaae0bf9999dbc6904eeca857082715fbe3d0548d3fbf8b9c850c76e1438b018b2029a9b6d1bc1c7e60bf16d1b4396b37ff"

RPROVIDES:${PN} += "libpacemaker-devel \
pacemaker-devel \
pacemaker-devel(aarch-64) \
pkgconfig(libpacemaker) \
pkgconfig(pacemaker) \
pkgconfig(pacemaker-cib) \
pkgconfig(pacemaker-cluster) \
pkgconfig(pacemaker-fencing) \
pkgconfig(pacemaker-lrmd) \
pkgconfig(pacemaker-pe_rules) \
pkgconfig(pacemaker-pe_status) \
pkgconfig(pacemaker-service)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtool-ltdl-devel \
pacemaker-libs \
pkgconfig \
pkgconfig(bzip2) \
pkgconfig(corosync) \
pkgconfig(dbus-1) \
pkgconfig(glib-2.0) \
pkgconfig(gnutls) \
pkgconfig(libcfg) \
pkgconfig(libcmap) \
pkgconfig(libcorosync_common) \
pkgconfig(libcpg) \
pkgconfig(libqb) \
pkgconfig(libquorum) \
pkgconfig(libxml-2.0) \
pkgconfig(libxslt) \
pkgconfig(pacemaker) \
pkgconfig(pacemaker-cib) \
pkgconfig(pacemaker-fencing) \
pkgconfig(pacemaker-lrmd) \
pkgconfig(pacemaker-pe_rules) \
pkgconfig(pacemaker-pe_status) \
pkgconfig(pacemaker-service) \
pkgconfig(uuid)"

inherit rpm
