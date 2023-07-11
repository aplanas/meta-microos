SUMMARY = "Pacemaker development package"
DESCRIPTION = "Pacemaker is an advanced, scalable High-Availability cluster resource \
manager. \
 \
The pacemaker-devel package contains headers and shared libraries \
for developing tools for Pacemaker."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.6+20230524.6fdc9deea"

RPM_NAME = "pacemaker-devel-2.1.6+20230524.6fdc9deea-1.1.aarch64.rpm"
RPM_HASH = "ddbaf88ec7e03ec864a1f383f56046b22d22f621a47ff39014c3a1b3dac82c03f832cf799ea2a36530dbad8cb722e625e1cca527d551005750f8ed1c0c64b89f"

RPROVIDES:${PN} += "libpacemaker-devel \
pacemaker-devel \
pkgconfig-libpacemaker \
pkgconfig-pacemaker \
pkgconfig-pacemaker-cib \
pkgconfig-pacemaker-cluster \
pkgconfig-pacemaker-fencing \
pkgconfig-pacemaker-lrmd \
pkgconfig-pacemaker-pe-rules \
pkgconfig-pacemaker-pe-status \
pkgconfig-pacemaker-service"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtool-ltdl-devel \
pacemaker-libs \
pkgconfig \
pkgconfig-bzip2 \
pkgconfig-corosync \
pkgconfig-dbus-1 \
pkgconfig-glib-2.0 \
pkgconfig-gnutls \
pkgconfig-libcfg \
pkgconfig-libcmap \
pkgconfig-libcorosync-common \
pkgconfig-libcpg \
pkgconfig-libqb \
pkgconfig-libquorum \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
pkgconfig-pacemaker \
pkgconfig-pacemaker-cib \
pkgconfig-pacemaker-fencing \
pkgconfig-pacemaker-lrmd \
pkgconfig-pacemaker-pe-rules \
pkgconfig-pacemaker-pe-status \
pkgconfig-pacemaker-service \
pkgconfig-uuid"

inherit rpm
