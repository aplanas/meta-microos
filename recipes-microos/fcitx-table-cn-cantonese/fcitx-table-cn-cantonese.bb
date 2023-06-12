SUMMARY = "Standard Guongdonkwa Penkyampji table for Fcitx"
DESCRIPTION = "Fcitx Guongdonkwa Penkyampji(Cantonese Pinyin) table for Simplified Chinese. \
 \
Cantonese Pinyin is a table input method, but it's not the pinyin used \
in Mainland China, but derivative schemes used by overseas Chinese in \
Hongkong, Kuala Lumpur, Sydney, Auckland, and Vancouver. \
This standard is released by Education department of Canton Province \
in 1960s. \
 \
See: http://en.wikipedia.org/wiki/Guangdong_Romanization for details \
 \
If you don't know what it is, don't try."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-cn-cantonese-0.3.8-2.5.noarch.rpm"
RPM_HASH = "d298751aadfdd0ee111c47817e91a275fde58ef78a7c3360e5c4170da4ad307c6be73d7068385821025167ea19020b18ac8e356fba5d942f62ae7fd8b757daa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-cantonese \
fcitx-table-extra"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
