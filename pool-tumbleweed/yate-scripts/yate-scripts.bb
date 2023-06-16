SUMMARY = "External scripting package for Yate"
DESCRIPTION = "The yate-scripts package includes libraries for using external scripts with Yate."
LICENSE = "GPL-2.0-only"

PV = "6.4.0"

RPM_NAME = "yate-scripts-6.4.0-4.9.aarch64.rpm"
RPM_HASH = "14067e3769c72ea8737262c48608280f40787f6c12eac14b39667eec3eb7d2e59c14f2f12c0692bcd53d668a163549898dec4471d88922b342de45460fd9c4dd"

RPROVIDES:${PN} += "perl-Yate \
yate-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/php \
/usr/bin/sh \
yate"

inherit rpm
