SUMMARY = "openSUSE branding of MozillaFirefox"
DESCRIPTION = "This package provides openSUSE look and feel for Firefox."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "68"

RPM_NAME = "MozillaFirefox-branding-openSUSE-68-4.1.aarch64.rpm"
RPM_HASH = "1cff05c8b0b53295cd9d44037ded1c82bb539799f2db2e58145d0cafbaf673187269a76836b71315828ca996a755f6a80bb218e4fcf20af389274f6c433bd785"

RPROVIDES:${PN} += "MozillaFirefox-branding MozillaFirefox-branding-openSUSE MozillaFirefox-branding-openSUSE(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
