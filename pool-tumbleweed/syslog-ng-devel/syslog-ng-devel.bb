SUMMARY = "Development files for syslog-ng"
DESCRIPTION = "This package provides files necessary for syslog-ng development."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-devel-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "d7e994471a6b96eb59f5b95ef4b3d83d26326e9bf2443384c3bde38e52a55cadb88e3813533a4938d5bb49b97db15b6943bfd66b5a06c3664d9c33411997fc59"

RPROVIDES:${PN} += "libevtlog-devel \
pkgconfig(syslog-ng) \
syslog-ng-devel \
syslog-ng-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/pkg-config \
glib2-devel \
glibc-devel \
libcap-devel \
libopenssl-1_1-devel \
pcre-devel \
pkgconfig(glib-2.0) \
syslog-ng \
systemd-devel"

inherit rpm
