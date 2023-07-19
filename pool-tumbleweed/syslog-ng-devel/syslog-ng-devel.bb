SUMMARY = "Development files for syslog-ng"
DESCRIPTION = "This package provides files necessary for syslog-ng development."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-devel-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "6a0bf5793cf070c6e7cb81d86cf99e7ebba22ba5b24d52016b210495a916f212cd96878840c7cdd35d0301fa406b47dae5c29c983f513ae0b0d8beeb9c98fba9"

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
