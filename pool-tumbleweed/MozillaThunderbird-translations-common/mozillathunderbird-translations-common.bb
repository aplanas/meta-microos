SUMMARY = "Common translations for Thunderbird"
DESCRIPTION = "This package contains several common languages for the user interface \
of Thunderbird."
LICENSE = "MPL-2.0"

PV = "102.13.0"

RPM_NAME = "MozillaThunderbird-translations-common-102.13.0-1.1.aarch64.rpm"
RPM_HASH = "fffa19e5912e58655b2287e51a43ac125bf5a82712783ab46e3d25880dfa0fa251c1f0dc2a304446af554d870c819a4f27ab48d16f0aa9b842abdf1a6ce01150"

RPROVIDES:${PN} += "MozillaThunderbird-translations-common \
locale-MozillaThunderbird-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "MozillaThunderbird"

inherit rpm
