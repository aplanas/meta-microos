SUMMARY = "LG based arm64 systems"
DESCRIPTION = "Device Tree files for LG based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-lg-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "0fd7a063e13d7d086bccb9f9b0f38690d928449a1a18680d91e27eed36e88d08e64cdcf63150409293eb596eb8d02866ff0bd4bccaba8efe66032ea5ea2742be"

RPROVIDES:${PN} += "dtb-lg dtb-lg(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
