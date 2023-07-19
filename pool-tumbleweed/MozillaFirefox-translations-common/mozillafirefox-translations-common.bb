SUMMARY = "Common translations for Firefox"
DESCRIPTION = "This package contains several common languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "115.0.2"

RPM_NAME = "MozillaFirefox-translations-common-115.0.2-1.1.aarch64.rpm"
RPM_HASH = "321356a7de77cf45f6e92d20a3a21bca18995eb6744b9bc47f8f481f1062630f40ffb10cf7b24b2449c5ec172ac99c7823c8cef7cd221d0cc4f59935c1815f90"

RPROVIDES:${PN} += "MozillaFirefox-translations \
MozillaFirefox-translations-common \
locale-MozillaFirefox-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
