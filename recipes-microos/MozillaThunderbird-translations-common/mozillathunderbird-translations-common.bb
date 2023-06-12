SUMMARY = "Common translations for Thunderbird"
DESCRIPTION = "This package contains several common languages for the user interface \
of Thunderbird."
LICENSE = "MPL-2.0"

PV = "102.11.2"

RPM_NAME = "MozillaThunderbird-translations-common-102.11.2-1.1.aarch64.rpm"
RPM_HASH = "a6b2530245a0598e1be5114b84be0a4d98934415abb47aa92e436591d13936fe1b6b0a47d5db347d85279c1d118ba7b4cea735dae2be90fd4ab72d026890c561"

RPROVIDES:${PN} += "MozillaThunderbird-translations-common MozillaThunderbird-translations-common(aarch-64) locale(MozillaThunderbird:ar;ca;cs;da;de;el;en_GB;es_AR;es_CL;es_ES;fi;fr;hu;it;ja;ko;nb_NO;nl;pl;pt_BR;pt_PT;ru;sv_SE;zh_CN;zh_TW)"
RDEPENDS:${PN} += "MozillaThunderbird"

inherit rpm
