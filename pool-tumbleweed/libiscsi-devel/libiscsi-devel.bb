SUMMARY = "Development files for libiscsi"
DESCRIPTION = "Development files for libiscsi"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.19.0+git.20230208"

RPM_NAME = "libiscsi-devel-1.19.0+git.20230208-1.3.aarch64.rpm"
RPM_HASH = "caf9e8e736f12ee95700a12582af13b927a79eaaf3c1cb53f9773a6ce73a511a184d4af6503e65c119e6b0329c577c0ef85d18bbe9dc2bf61d14a8b8477dbb73"

RPROVIDES:${PN} += "libiscsi-devel \
pkgconfig-libiscsi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libiscsi9"

inherit rpm
