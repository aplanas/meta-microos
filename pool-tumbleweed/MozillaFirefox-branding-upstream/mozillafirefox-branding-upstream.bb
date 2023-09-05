SUMMARY = "Upstream branding for Firefox"
DESCRIPTION = "This package provides upstream look and feel for Firefox."
LICENSE = "MPL-2.0"

PV = "117.0"

RPM_NAME = "MozillaFirefox-branding-upstream-117.0-1.1.aarch64.rpm"
RPM_HASH = "bc0fb718dcf45b11ce3447072bce8546627a2c7f7e9545b4fed88481068ecfcadeedf6152ca9696f4bc556866fda674d9cbdd95294f972bbf3d5012acdf9c971"

RPROVIDES:${PN} += "MozillaFirefox-branding \
MozillaFirefox-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
