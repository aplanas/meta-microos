SUMMARY = "Upstream branding for Firefox"
DESCRIPTION = "This package provides upstream look and feel for Firefox."
LICENSE = "MPL-2.0"

PV = "115.0.1"

RPM_NAME = "MozillaFirefox-branding-upstream-115.0.1-1.1.aarch64.rpm"
RPM_HASH = "a5720873519fadc833c369c22d455f613ec91f424ea738a1af64d3ee90f4c0b67dfd7f1b6709a0577924bd03f5ec5df10607f9be1bff3467c8cbe3b25e2289f3"

RPROVIDES:${PN} += "MozillaFirefox-branding \
MozillaFirefox-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
