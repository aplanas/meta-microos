SUMMARY = "Common translations for Firefox"
DESCRIPTION = "This package contains several common languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "117.0"

RPM_NAME = "MozillaFirefox-translations-common-117.0-1.1.aarch64.rpm"
RPM_HASH = "bc0c5d1f8d40ac0f3e357de63479035df6b6950d1ad386d821704837992e891ca00bd09b601f49f57cd314193daf8fd267a9fa1fa9f4a587b52073a70c9ef075"

RPROVIDES:${PN} += "MozillaFirefox-translations \
MozillaFirefox-translations-common \
locale-MozillaFirefox-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
