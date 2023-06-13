SUMMARY = "Welsh (Cymraeg) Dictionary for Aspell"
DESCRIPTION = "A Welsh (Cymraeg) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.3"

RPM_NAME = "aspell-cy-0.50.3-2.14.aarch64.rpm"
RPM_HASH = "4edfc7cd470fae34094b80781724dcab5a66c546e34e690ac21c856b419ad12e2387bf1fa28cb95a3bfc94e6a9bc28c19b19b98ee93ab6509028f6b9bd6a14f4"

RPROVIDES:${PN} += "aspell-cy \
aspell-cy(aarch-64) \
locale(aspell:cy)"

RDEPENDS:${PN} += ""

inherit rpm
