SUMMARY = "Devel package for poke"
DESCRIPTION = "Development package for poke."
LICENSE = "GPL-3.0-or-later"

PV = "3.3"

RPM_NAME = "poke-devel-3.3-1.1.aarch64.rpm"
RPM_HASH = "e89bf560dae36250da02b1cf181f485d7376be64fabac6dd0c0a57f6208df4262b88e936c02aa66e10cdf434dd6b737d09e536da3341ae880958dee014b8a391"

RPROVIDES:${PN} += "pkgconfig-poke \
poke-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpoke0"

inherit rpm
