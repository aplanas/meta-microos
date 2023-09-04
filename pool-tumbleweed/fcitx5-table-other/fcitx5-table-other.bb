SUMMARY = "Other Non-Chinese table input methods for Fcitx5"
DESCRIPTION = "fcitx-table-other provides some other Non-Chinese table for Fcitx."
LICENSE = "GPL-3.0-only & SUSE-Public-Domain"

PV = "5.1.0"

RPM_NAME = "fcitx5-table-other-5.1.0-1.1.noarch.rpm"
RPM_HASH = "f273d030ae3c04f3b3c545b54b947ecbe8f57303a7b3edbe16703c31c86aa73d2085b9a3c8489ddbc7e106cce633b642beeec31bbdc069032cc191e1f32beba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-amharic \
fcitx-table-arabic \
fcitx-table-cn-cns11643 \
fcitx-table-emoji \
fcitx-table-ipa-x-sampa \
fcitx-table-latex \
fcitx-table-malayalam-compose \
fcitx-table-malayalam-phonetic \
fcitx-table-other \
fcitx-table-ru-rustrad \
fcitx-table-ru-translit \
fcitx-table-ru-yawerty \
fcitx-table-tamil-remington \
fcitx-table-thai \
fcitx-table-ua-translit \
fcitx-table-vi-qr \
fcitx5-table-other"

RDEPENDS:${PN} += "fcitx5"

inherit rpm
