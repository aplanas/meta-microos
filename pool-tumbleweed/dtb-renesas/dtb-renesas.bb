SUMMARY = "Renesas based arm64 systems"
DESCRIPTION = "Device Tree files for Renesas based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-renesas-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "2a01e0db1439f9fe86f483bf43c39213ef959ef564b79858eca710dc4deb3f13f1dcae8b2db6813ebd91b4596ba8258da66136dd7fb6b3176a008747b2fcbd03"

RPROVIDES:${PN} += "dtb-renesas \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
