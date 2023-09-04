SUMMARY = "Development files for syslog-ng"
DESCRIPTION = "This package provides files necessary for syslog-ng development."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-devel-4.3.1-1.2.aarch64.rpm"
RPM_HASH = "f354c9bf067fd2c8d4fb8162d520aff0b0ccc414ead1537451b6a3394c35b38e91df119d604661f83e64ad6f32983a800de8cb02075e21460fff8e147501f3e1"

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
