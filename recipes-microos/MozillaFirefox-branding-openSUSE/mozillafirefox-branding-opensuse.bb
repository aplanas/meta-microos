SUMMARY = "openSUSE branding of MozillaFirefox"
DESCRIPTION = "This package provides openSUSE look and feel for Firefox."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "68"

RPM_NAME = "MozillaFirefox-branding-openSUSE-68-3.6.aarch64.rpm"
RPM_HASH = "59ea3607ec4beabe2426c04edea0bc6bbc5eea873cb36c335978fe11a47177f034f18fb861728e0ee44f987710014638e26f3d5123eecd01c12e04da21924738"

RPROVIDES:${PN} += "MozillaFirefox-branding MozillaFirefox-branding-openSUSE MozillaFirefox-branding-openSUSE(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
