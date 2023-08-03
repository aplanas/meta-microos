SUMMARY = "Common translations for Firefox"
DESCRIPTION = "This package contains several common languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "115.0.3"

RPM_NAME = "MozillaFirefox-translations-common-115.0.3-1.1.aarch64.rpm"
RPM_HASH = "b65726b6aa1289ffcc8142ab53d01af24d12df2d2a3713a926526139d5da9c11eb30a0e255a33d9826eb3b19826e4407e5bcbe781b2a1435366f089a7f819025"

RPROVIDES:${PN} += "MozillaFirefox-translations \
MozillaFirefox-translations-common \
locale-MozillaFirefox-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
