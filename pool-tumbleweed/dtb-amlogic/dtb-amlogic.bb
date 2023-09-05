SUMMARY = "Amlogic based arm64 systems"
DESCRIPTION = "Device Tree files for Amlogic based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-amlogic-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "2c359e1a9b3cb8c6078f49238df29a1e39d429b2f49c1cbbc0e84e0a7e6327b610ac80c7f58f013d602c929fa9c096c437a09a34be10b10dabd2b386edabcc95"

RPROVIDES:${PN} += "dtb-amlogic \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
