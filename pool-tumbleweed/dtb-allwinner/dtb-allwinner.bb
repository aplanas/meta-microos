SUMMARY = "Allwinner based arm64 systems"
DESCRIPTION = "Device Tree files for Allwinner based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-allwinner-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "e0184fb55ec59de11a23249b0476bf8da45964a447f821ef91dd637f6ade16668641faa45eb21c9b5c59bf78c36952a74092c7d48e01c954d9278a05eba335f9"

RPROVIDES:${PN} += "dtb-allwinner \
multiversion-dtb"

RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
