SUMMARY = "Development files for syslog-ng"
DESCRIPTION = "This package provides files necessary for syslog-ng development."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-devel-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "fed0d6b102b07b4a941979b7877e552f76e119a747e698ec6a1dbe7e1d8c6b2fc400a7205992165a0f77969fd3f6d80233da9e71d5c6d1778840fd9763e07096"

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
