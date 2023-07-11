SUMMARY = "Common translations for Thunderbird"
DESCRIPTION = "This package contains several common languages for the user interface \
of Thunderbird."
LICENSE = "MPL-2.0"

PV = "102.12.0"

RPM_NAME = "MozillaThunderbird-translations-common-102.12.0-1.2.aarch64.rpm"
RPM_HASH = "df3cd7a371f6f8a02cd634e10c7ae3b254c90fa16d74ad4813c2cc1c4dc059253d6fed04b84074ff58b23edc038c063fc425f9c0bf66252d62a2efa0f4f3428a"

RPROVIDES:${PN} += "MozillaThunderbird-translations-common \
locale-MozillaThunderbird-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "MozillaThunderbird"

inherit rpm
