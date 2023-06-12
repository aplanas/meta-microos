SUMMARY = "Translations for Thonny IDE"
DESCRIPTION = "Provides translations for Thonny IDE"
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "thonny-lang-4.0.2-1.3.noarch.rpm"
RPM_HASH = "5940ba6c48b60910d4567203440f86c37c86b7d988e5379814ff56714321ec9ea47fd1dd975ddee9de639de8785c050497b9de0979522672e8f1b5f71b7e56b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(thonny:ar_AR) \
locale(thonny:cs_CZ) \
locale(thonny:de_DE) \
locale(thonny:el_GR) \
locale(thonny:en_US) \
locale(thonny:es_ES) \
locale(thonny:et_EE) \
locale(thonny:fa_IR) \
locale(thonny:fi_FI) \
locale(thonny:fr_FR) \
locale(thonny:hu_HU) \
locale(thonny:hy_AM) \
locale(thonny:it_IT) \
locale(thonny:ja_JP) \
locale(thonny:ko_KR) \
locale(thonny:lt_LT) \
locale(thonny:nb_NO) \
locale(thonny:nl_NL) \
locale(thonny:nn_NO) \
locale(thonny:pl_PL) \
locale(thonny:pt_BR) \
locale(thonny:pt_PT) \
locale(thonny:ro_RO) \
locale(thonny:ru_RU) \
locale(thonny:sk_SK) \
locale(thonny:sl_SI) \
locale(thonny:sq_AL) \
locale(thonny:sv_SE) \
locale(thonny:ta_IN) \
locale(thonny:th_TH) \
locale(thonny:tr_TR) \
locale(thonny:uk_UA) \
locale(thonny:vi_VN) \
locale(thonny:zh_CN) \
locale(thonny:zh_TW) \
thonny-lang"
RDEPENDS:${PN} += "python(abi) \
thonny"

inherit rpm
