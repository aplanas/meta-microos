SUMMARY = "Translations for package zathura"
DESCRIPTION = "Provides translations for the 'zathura' package."
LICENSE = "Zlib"

PV = "0.5.2"

RPM_NAME = "zathura-lang-0.5.2-1.3.noarch.rpm"
RPM_HASH = "306c8b6c816e4b00ef5c41bf477ed58929bf7865c73e2abf2bf8a05d081dc00f72640e60d73ad7c2090d89f4065ea7b2ac2aeccdc0b34881c228a08959ec1259"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(zathura:ar) \
locale(zathura:ca) \
locale(zathura:cs) \
locale(zathura:de) \
locale(zathura:el) \
locale(zathura:eo) \
locale(zathura:es) \
locale(zathura:es_CL) \
locale(zathura:et) \
locale(zathura:fr) \
locale(zathura:he) \
locale(zathura:hr) \
locale(zathura:it) \
locale(zathura:lt) \
locale(zathura:nl) \
locale(zathura:pl) \
locale(zathura:pt_BR) \
locale(zathura:ru) \
locale(zathura:sv) \
locale(zathura:tr) \
locale(zathura:uk_UA) \
zathura-lang \
zathura-lang-all"
RDEPENDS:${PN} += "zathura"

inherit rpm
