SUMMARY = "UEFI Secure Boot Certificate For Package gasket-driver-kmp"
DESCRIPTION = "This package contains the UEFI Secure Boot certificate used to sign \
modules in the gasket-driver-kmp packages."
LICENSE = "GPL-2.0-only"

PV = "1.0.18"

RPM_NAME = "gasket-driver-ueficert-1.0.18-2.6.aarch64.rpm"
RPM_HASH = "961e877616b1237b5796ad445b6fbe4a91db409630d971fe24baae7932819799cd5c80add6842afac8d64bf890735708dcd339f27ad799b6645c0474cfacf487"

RPROVIDES:${PN} += "gasket-driver-ueficert"

RDEPENDS:${PN} += "/usr/bin/sh \
suse-kernel-rpm-scriptlets"

inherit rpm
