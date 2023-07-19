SUMMARY = "Upstream branding for Firefox"
DESCRIPTION = "This package provides upstream look and feel for Firefox."
LICENSE = "MPL-2.0"

PV = "115.0.2"

RPM_NAME = "MozillaFirefox-branding-upstream-115.0.2-1.1.aarch64.rpm"
RPM_HASH = "0c1744b37c6fd656177baa1236cceb9e3e33a2fbe83ed6962c505ac23375b7a0995ebfdef780e783ef06d1f0690d85755340825ae3ae0a210e742bd19a3acf4f"

RPROVIDES:${PN} += "MozillaFirefox-branding \
MozillaFirefox-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
