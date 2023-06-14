SUMMARY = "Common translations for Firefox"
DESCRIPTION = "This package contains several common languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "113.0.2"

RPM_NAME = "MozillaFirefox-translations-common-113.0.2-1.1.aarch64.rpm"
RPM_HASH = "23cae59d331d2423ea1f0ca75f332a280bef756027ea04c04aeeda0edb93e03eba08af9e41c4b53de34692ea04409c43ef397862fb6702117ae8fb3024b96b69"

RPROVIDES:${PN} += "MozillaFirefox-translations \
MozillaFirefox-translations-common \
locale-MozillaFirefox-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
