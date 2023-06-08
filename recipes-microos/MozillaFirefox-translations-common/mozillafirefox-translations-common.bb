SUMMARY = "Common translations for Firefox"
DESCRIPTION = "This package contains several common languages for the user interface \
of Firefox."
LICENSE = "MPL-2.0"

PV = "112.0.2"

RPM_NAME = "MozillaFirefox-translations-common-112.0.2-2.1.aarch64.rpm"
RPM_HASH = "303bbf3c1acbbb8bf1b1989a5d352948424e104cbac256b0d4f468146dbcb402401217fd1c001d486bbe0e6ba1ffd055e23f4fe963da6614a45af4adf023946d"

RPROVIDES:${PN} += "MozillaFirefox-translations MozillaFirefox-translations-common MozillaFirefox-translations-common(aarch-64) locale(MozillaFirefox:ar;ca;cs;da;de;el;en_GB;es_AR;es_CL;es_ES;fi;fr;hu;it;ja;ko;nb_NO;nl;pl;pt_BR;pt_PT;ru;sv_SE;zh_CN;zh_TW)"
RDEPENDS:${PN} += "MozillaFirefox"

inherit rpm
