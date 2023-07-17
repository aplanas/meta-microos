SUMMARY = "Common translations for Firefox"
DESCRIPTION = "This package contains several common languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "115.0.1"

RPM_NAME = "MozillaFirefox-translations-common-115.0.1-1.1.aarch64.rpm"
RPM_HASH = "3cbbd099801a5e052e90653e44030267cf53b0c22f017fa890d7c6013600cddedcc917f42d881c54269534bf113a8bb92c6fa6f0d7d88570a56c1e93ef07ef54"

RPROVIDES:${PN} += "MozillaFirefox-translations \
MozillaFirefox-translations-common \
locale-MozillaFirefox-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
