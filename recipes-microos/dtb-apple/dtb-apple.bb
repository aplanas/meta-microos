SUMMARY = "Apple SOC based arm64 systems"
DESCRIPTION = "Device Tree files for Apple SOC based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-apple-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "5d291c448139579a9cc113b75ad3f83dd487b492c59264b3e8509bf392b26274aa0c57371aac3f324d8dfbc4c124827f70fe2721d62e32161d32215c79d37701"

RPROVIDES:${PN} += "dtb-apple dtb-apple(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
