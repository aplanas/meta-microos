SUMMARY = "Common translations for Firefox"
DESCRIPTION = "This package contains several common languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "115.0"

RPM_NAME = "MozillaFirefox-translations-common-115.0-1.1.aarch64.rpm"
RPM_HASH = "b9672824064980a49609e4308b98cc6e1aa1cfd2c9bd7a3b865729d425e8452c1c77dfc8df2b2e29031ba6f1e4dd4c7ed9a824f7a486d8bc11b21e01f7818bbb"

RPROVIDES:${PN} += "MozillaFirefox-translations \
MozillaFirefox-translations-common \
locale-MozillaFirefox-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
