SUMMARY = "Altera based arm64 systems"
DESCRIPTION = "Device Tree files for Altera based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-altera-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "8abb0da569f7471083bd6be5607186e952291eeca5d4b3fc9e069a57b454846d5d80256747a34d29f1f63c3c43fb805396f2e17fbd8457cce77195a0af9ee1ba"

RPROVIDES:${PN} += "dtb-altera \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
