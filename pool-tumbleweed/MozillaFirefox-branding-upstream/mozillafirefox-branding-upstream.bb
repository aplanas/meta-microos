SUMMARY = "Upstream branding for Firefox"
DESCRIPTION = "This package provides upstream look and feel for Firefox."
LICENSE = "MPL-2.0"

PV = "115.0"

RPM_NAME = "MozillaFirefox-branding-upstream-115.0-1.1.aarch64.rpm"
RPM_HASH = "e2533bbfe1599a5848f1838789ef24a88539288cba70c707d0c24e0116ddef654aa7c2f101ee151d1235cb0a91e15460b0b849b7967f61823a2b4a5096770a79"

RPROVIDES:${PN} += "MozillaFirefox-branding \
MozillaFirefox-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
