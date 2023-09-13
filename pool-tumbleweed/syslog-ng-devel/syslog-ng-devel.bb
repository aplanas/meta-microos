SUMMARY = "Development files for syslog-ng"
DESCRIPTION = "This package provides files necessary for syslog-ng development."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-devel-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "7f61b32944b8755e4d5f4efe110548d58ed27a389dd6f252ea304bfcef3f1640cd62006685c0d48c55f1ed90b400cdb968fe8130a9974efe3feaa9d808f5eeda"

RPROVIDES:${PN} += "libevtlog-devel \
pkgconfig-syslog-ng \
syslog-ng-devel"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/pkg-config \
/usr/bin/sh \
glib2-devel \
glibc-devel \
libcap-devel \
libopenssl-1-1-devel \
pcre-devel \
pkgconfig-glib-2.0 \
syslog-ng \
systemd-devel"

inherit rpm
