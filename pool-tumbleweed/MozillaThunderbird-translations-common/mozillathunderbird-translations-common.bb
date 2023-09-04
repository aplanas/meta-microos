SUMMARY = "Common translations for Thunderbird"
DESCRIPTION = "This package contains several common languages for the user interface \
of Thunderbird."
LICENSE = "MPL-2.0"

PV = "102.14.0"

RPM_NAME = "MozillaThunderbird-translations-common-102.14.0-1.1.aarch64.rpm"
RPM_HASH = "5854277b6acf80335e00b4b7f64949b37e8649a559da94eee111277be3c6110efe1a3d13e25cb4b009581901a7830b462bc01282230c90ea929efba4ca218e8c"

RPROVIDES:${PN} += "MozillaThunderbird-translations-common \
locale-MozillaThunderbird-ar;ca;cs;da;de;el;en-GB;es-AR;es-CL;es-ES;fi;fr;hu;it;ja;ko;nb-NO;nl;pl;pt-BR;pt-PT;ru;sv-SE;zh-CN;zh-TW"

RDEPENDS:${PN} += "MozillaThunderbird"

inherit rpm
