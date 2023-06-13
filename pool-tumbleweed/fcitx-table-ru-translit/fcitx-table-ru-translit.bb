SUMMARY = "Russian Translit table for Fcitx"
DESCRIPTION = "Fcitx Russian Translit table."
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-ru-translit-0.2.4-2.5.noarch.rpm"
RPM_HASH = "462c6ae1ce565359c3844ca3e6045fea167b69e95642cf3b221a0d8c8b43090896144c97ff3a10775a2f59a56e5cbeb20367c7b84fea441cfffaf74a4c3736ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-other \
fcitx-table-ru-translit"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
