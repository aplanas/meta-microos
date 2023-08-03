SUMMARY = "Upstream branding for Firefox"
DESCRIPTION = "This package provides upstream look and feel for Firefox."
LICENSE = "MPL-2.0"

PV = "115.0.3"

RPM_NAME = "MozillaFirefox-branding-upstream-115.0.3-1.1.aarch64.rpm"
RPM_HASH = "6aebdfc037ae7fd3c95179128b9781752dd0e73d30ad1fc1bb984df9281eb76872927ebe5e03bebca8897b72c4200b454fd624e7ad17e67134a19e536c235ab5"

RPROVIDES:${PN} += "MozillaFirefox-branding \
MozillaFirefox-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
