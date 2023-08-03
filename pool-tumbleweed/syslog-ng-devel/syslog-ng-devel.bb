SUMMARY = "Development files for syslog-ng"
DESCRIPTION = "This package provides files necessary for syslog-ng development."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-devel-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "68bf415c7606d079f5fa0ee4f151d5913a73372680270c21689eb8d0e5157e28a8f665a311c9ec71bd81190991d17e4834449e6eda3b68cd11d94bad228210a2"

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
