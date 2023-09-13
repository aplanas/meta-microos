SUMMARY = "Common translations for Thunderbird"
DESCRIPTION = "This package contains several common languages for the user interface \
of Thunderbird."
LICENSE = "MPL-2.0"

PV = "115.2.0"

RPM_NAME = "MozillaThunderbird-translations-common-115.2.0-1.1.aarch64.rpm"
RPM_HASH = "4bb57c4ae92653dddfb8ab49b0b9eb73df8d2267ef27f0fe76b2cb3ad1b1f888e68f17f4be55c47a84c1d3309bfee83f6751d97719c7a68be9a98034f8a2c471"

RPROVIDES:${PN} += "MozillaThunderbird-translations-common \
locale-MozillaThunderbird-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "MozillaThunderbird"

inherit rpm
