SUMMARY = "Altera based arm64 systems"
DESCRIPTION = "Device Tree files for Altera based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-altera-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "f286f7c5e03f9ee47106bbe01d0c3f9ec30187b4dd4eed5d92bfe7ce1f32478274477b61b2649f468fc0e0ce027b644e6d34f2bb0f97707a3a68e1c588514698"

RPROVIDES:${PN} += "dtb-altera dtb-altera(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
