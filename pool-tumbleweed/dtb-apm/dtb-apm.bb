SUMMARY = "AppliedMicro based arm64 systems"
DESCRIPTION = "Device Tree files for AppliedMicro based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-apm-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "8a0c0badf8eeb529dd5922fa77d10628481781d725e95e1b9c633c1f94fb59958be4fc04cdb63f0dd2473dfcc8c04f0c45330a911c3e0c2ca489ba0adf224cd6"

RPROVIDES:${PN} += "dtb-apm \
dtb-apm-mustang \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
