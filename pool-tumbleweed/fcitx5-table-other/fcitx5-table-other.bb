SUMMARY = "Other Non-Chinese table input methods for Fcitx5"
DESCRIPTION = "fcitx-table-other provides some other Non-Chinese table for Fcitx."
LICENSE = "GPL-3.0-only & SUSE-Public-Domain"

PV = "5.0.11"

RPM_NAME = "fcitx5-table-other-5.0.11-1.1.noarch.rpm"
RPM_HASH = "36554e102f07e66e7fdc970378906d011de37529043befc6d25db00c461d9646e6e6748664b8b7c017c03ea021e3f3e670bf607fc64a26a3470838146c9bc392"
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
fcitx5-table-other \
metainfo() \
metainfo(org.fcitx.Fcitx5.Addon.TableOther.metainfo.xml)"
RDEPENDS:${PN} += "fcitx5"

inherit rpm
