SUMMARY = "Translations for package whatsapp-for-linux"
DESCRIPTION = "Provides translations for the 'whatsapp-for-linux' package."
LICENSE = "GPL-3.0-only"

PV = "1.6.4"

RPM_NAME = "whatsapp-for-linux-lang-1.6.4-1.1.noarch.rpm"
RPM_HASH = "3cb39ac8dec552b639d8800bc0228e5c7005f076230394eb284d59d5ebc62c66a05a09634d85a0ab5d5886630e51c27028ceeac910c4d469ecf73c0854e5da2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-whatsapp-for-linux-bn \
locale-whatsapp-for-linux-cs \
locale-whatsapp-for-linux-de \
locale-whatsapp-for-linux-es \
locale-whatsapp-for-linux-fr \
locale-whatsapp-for-linux-hu \
locale-whatsapp-for-linux-it \
locale-whatsapp-for-linux-ka \
locale-whatsapp-for-linux-nl \
locale-whatsapp-for-linux-ru \
locale-whatsapp-for-linux-si \
locale-whatsapp-for-linux-tr \
whatsapp-for-linux-lang \
whatsapp-for-linux-lang-all"

RDEPENDS:${PN} += "whatsapp-for-linux"

inherit rpm
