SUMMARY = "Common translations for Firefox"
DESCRIPTION = "This package contains several common languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "116.0.3"

RPM_NAME = "MozillaFirefox-translations-common-116.0.3-1.1.aarch64.rpm"
RPM_HASH = "c8fe346a73d45d39d3934ef587ac46a9da6814d3975288190e6229d025eee93fc05a23452d745792d79b3425f741c7b10dc7a590b544a096229d20ee6865a229"

RPROVIDES:${PN} += "MozillaFirefox-translations \
MozillaFirefox-translations-common \
locale-MozillaFirefox-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
