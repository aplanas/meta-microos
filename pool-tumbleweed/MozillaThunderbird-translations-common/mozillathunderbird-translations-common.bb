SUMMARY = "Common translations for Thunderbird"
DESCRIPTION = "This package contains several common languages for the user interface \
of Thunderbird."
LICENSE = "MPL-2.0"

PV = "102.13.1"

RPM_NAME = "MozillaThunderbird-translations-common-102.13.1-1.1.aarch64.rpm"
RPM_HASH = "386b2f9a04cc32c0d5ddaf314a80abd5c5431571381328d08063bbc3563cb3d3b956b1ce9ecc2e11d1b46768da78dfda26846ab9f87729daee8dd3df4157eecd"

RPROVIDES:${PN} += "MozillaThunderbird-translations-common \
locale-MozillaThunderbird-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "MozillaThunderbird"

inherit rpm
