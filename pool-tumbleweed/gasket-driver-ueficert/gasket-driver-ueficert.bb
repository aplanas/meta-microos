SUMMARY = "UEFI Secure Boot Certificate For Package gasket-driver-kmp"
DESCRIPTION = "This package contains the UEFI Secure Boot certificate used to sign \
modules in the gasket-driver-kmp packages."
LICENSE = "GPL-2.0-only"

PV = "1.0.18"

RPM_NAME = "gasket-driver-ueficert-1.0.18-2.5.aarch64.rpm"
RPM_HASH = "bb64851353b9776f3d7d92ac3231ea21365f5d388b506341d62bed218628c007ad1da809dd2c1a112c0340b483f18c5a525fae43f7490917426c42c76a787f67"

RPROVIDES:${PN} += "gasket-driver-ueficert"

RDEPENDS:${PN} += "/usr/bin/sh \
suse-kernel-rpm-scriptlets"

inherit rpm
