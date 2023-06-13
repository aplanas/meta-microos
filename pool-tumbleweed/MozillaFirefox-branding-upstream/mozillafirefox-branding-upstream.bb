SUMMARY = "Upstream branding for Firefox"
DESCRIPTION = "This package provides upstream look and feel for Firefox."
LICENSE = "MPL-2.0"

PV = "113.0.2"

RPM_NAME = "MozillaFirefox-branding-upstream-113.0.2-1.1.aarch64.rpm"
RPM_HASH = "832c8a4ee9c3d329508007c386a4706c5ae220be18960be32dc76002211a0bfd69c1ddd4ce5be42c735569d2d78d95b284f0e0dc5f16d46af72b6b4e5aabcf24"

RPROVIDES:${PN} += "MozillaFirefox-branding \
MozillaFirefox-branding-upstream \
MozillaFirefox-branding-upstream(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
