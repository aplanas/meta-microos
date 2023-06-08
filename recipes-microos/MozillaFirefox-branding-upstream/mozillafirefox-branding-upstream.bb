SUMMARY = "Upstream branding for Firefox"
DESCRIPTION = "This package provides upstream look and feel for Firefox."
LICENSE = "MPL-2.0"

PV = "112.0.2"

RPM_NAME = "MozillaFirefox-branding-upstream-112.0.2-2.1.aarch64.rpm"
RPM_HASH = "ab56fc936859b04472d90b089a79b3c276d34a72516378d16d428fde01b32c9b0a9a6976c38496b2d6d4c2b4ced1e9e81d1e27bc981b4d611517c5bdfd5ffe5d"

RPROVIDES:${PN} += "MozillaFirefox-branding MozillaFirefox-branding-upstream MozillaFirefox-branding-upstream(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
