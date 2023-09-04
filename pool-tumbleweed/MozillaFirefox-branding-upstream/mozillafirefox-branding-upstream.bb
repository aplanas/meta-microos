SUMMARY = "Upstream branding for Firefox"
DESCRIPTION = "This package provides upstream look and feel for Firefox."
LICENSE = "MPL-2.0"

PV = "116.0.3"

RPM_NAME = "MozillaFirefox-branding-upstream-116.0.3-1.1.aarch64.rpm"
RPM_HASH = "e7c77e579aa8d37327f1ee3fc9bc412ad2ca88c35c1ef1d6869d5a7cdc8e8e4e8f914047e805387ca37e5b2df6fb13196d8238227b01843a14b2df8e55e2f8bf"

RPROVIDES:${PN} += "MozillaFirefox-branding \
MozillaFirefox-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
