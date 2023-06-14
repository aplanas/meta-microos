SUMMARY = "Upper Sorbian (hornjoserbsce) Dictionary for Aspell"
DESCRIPTION = "An Upper Sorbian (hornjoserbsce) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.0"

RPM_NAME = "aspell-hsb-0.02.0-2.14.aarch64.rpm"
RPM_HASH = "fe5319fb74b6a0682bcb7ca98bfd2b2e294a6ab8c44f51aa98fdae21de1e6878e8232d2227ef9ea01f8fde198f7d4c950240a17be36cc77d11ba8e7b51cfea41"

RPROVIDES:${PN} += "aspell-hsb \
locale-aspell-hsb"

RDEPENDS:${PN} += ""

inherit rpm
