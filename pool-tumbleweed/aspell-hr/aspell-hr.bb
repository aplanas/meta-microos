SUMMARY = "Croatian (hrvatski) Dictionary for Aspell"
DESCRIPTION = "A Croatian (hrvatski) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.51.0"

RPM_NAME = "aspell-hr-0.51.0-2.14.aarch64.rpm"
RPM_HASH = "d3f30f86c25c623e6c31c336d36788f8fcc242da168106b31fe9ae5bcc7f27af77223143440d4a0d5b0e9f4bd174b41d0f7408149b6e2a00e1f3378a6d00990a"

RPROVIDES:${PN} += "aspell-hr \
aspell-hr(aarch-64) \
locale(aspell:hr)"
RDEPENDS:${PN} += ""

inherit rpm
