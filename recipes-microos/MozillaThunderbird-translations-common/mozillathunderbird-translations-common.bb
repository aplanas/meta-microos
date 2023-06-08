SUMMARY = "Common translations for Thunderbird"
DESCRIPTION = "This package contains several common languages for the user interface \
of Thunderbird."
LICENSE = "MPL-2.0"

PV = "102.10.1"

RPM_NAME = "MozillaThunderbird-translations-common-102.10.1-1.1.aarch64.rpm"
RPM_HASH = "a2192c6b6b0f343c9b3e41e4b66e5a97a3b7aa0e583845d3e77c7bad7ba084d23453d47ab81844c9265a3958cdb8cb2b85349fedc226cbbecb7e08a6cfd66c3b"

RPROVIDES:${PN} += "MozillaThunderbird-translations-common MozillaThunderbird-translations-common(aarch-64) locale(MozillaThunderbird:ar;ca;cs;da;de;el;en_GB;es_AR;es_CL;es_ES;fi;fr;hu;it;ja;ko;nb_NO;nl;pl;pt_BR;pt_PT;ru;sv_SE;zh_CN;zh_TW)"
RDEPENDS:${PN} += "MozillaThunderbird"

inherit rpm
