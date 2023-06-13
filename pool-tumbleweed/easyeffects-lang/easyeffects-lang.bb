SUMMARY = "Translations for package easyeffects"
DESCRIPTION = "Provides translations for the 'easyeffects' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "easyeffects-lang-7.0.3-1.1.noarch.rpm"
RPM_HASH = "3121be26609724f6a64809b3d9d1408832b5493a2a1a4f9047f44172494bc37b1aa0f6111085af1b59e78644744828f00e6cdee2456b98738a0fd0c9a84c7a4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easyeffects-lang \
easyeffects-lang-all \
locale(easyeffects:af) \
locale(easyeffects:bg) \
locale(easyeffects:cs) \
locale(easyeffects:da) \
locale(easyeffects:de) \
locale(easyeffects:es) \
locale(easyeffects:es_CO) \
locale(easyeffects:es_MX) \
locale(easyeffects:es_VE) \
locale(easyeffects:fr_FR) \
locale(easyeffects:gl) \
locale(easyeffects:hr) \
locale(easyeffects:it_IT) \
locale(easyeffects:ja) \
locale(easyeffects:ka) \
locale(easyeffects:km) \
locale(easyeffects:ko) \
locale(easyeffects:nb_NO) \
locale(easyeffects:nl) \
locale(easyeffects:pl) \
locale(easyeffects:pt_BR) \
locale(easyeffects:ro) \
locale(easyeffects:ru) \
locale(easyeffects:sk) \
locale(easyeffects:sv) \
locale(easyeffects:th) \
locale(easyeffects:tr) \
locale(easyeffects:zh_CN)"

RDEPENDS:${PN} += "easyeffects"

inherit rpm
