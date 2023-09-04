SUMMARY = "Development files for hivex"
DESCRIPTION = "Development files for hivex. Hivex is a Windows Registry Hive extraction \
library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "hivex-devel-1.3.23-2.6.aarch64.rpm"
RPM_HASH = "82fa1c19b9fa43f714e9f2e476e8acb25c883a8e82def40de5d66813f0f0e0589ba619594ccf7278e39b48b46057a5b1fadbeb936d5fa1990dcc71fe0b6f6499"

RPROVIDES:${PN} += "hivex-devel \
pkgconfig-hivex"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhivex0"

inherit rpm
