SUMMARY = "Java destination support for syslog-ng"
DESCRIPTION = "This package provides Java destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-java-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "dae9ffdfedba9663871c31d480a584754b32c0b8fa47579d7a367a6e91e2aea45bb50ddf431c5c40379022e00e10ecb2c11dbdb4c8b6774332b274acde8891fb"

RPROVIDES:${PN} += "syslog-ng-java"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjvm.so \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
