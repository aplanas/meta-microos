SUMMARY = "Translations for package colorpicker"
DESCRIPTION = "Provides translations for the 'colorpicker' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.5"

RPM_NAME = "colorpicker-lang-1.1.5-1.17.noarch.rpm"
RPM_HASH = "26c0e5783009ab7ff8ccae31ce02bdcf3557171808f71f6551375f895169c195cc6ce73eee0f940bfadc0448c526f20124cab749be74b9aa0dfb0fbcb63a62a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colorpicker-lang colorpicker-lang-all locale(colorpicker:bg) locale(colorpicker:ca) locale(colorpicker:de) locale(colorpicker:es) locale(colorpicker:fr) locale(colorpicker:nl) locale(colorpicker:pl) locale(colorpicker:pt_PT) locale(colorpicker:tr)"
RDEPENDS:${PN} += "colorpicker"

inherit rpm
