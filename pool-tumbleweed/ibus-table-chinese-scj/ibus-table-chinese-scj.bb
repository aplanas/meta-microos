SUMMARY = "Smart Cangjie input method"
DESCRIPTION = "Smart Cangjie is an improved Cangjie base input method \
which handles Cangjie, Quick, Cantonese, Chinese punctuation, \
Japanese, 3000 frequent words by Hong Kong government, \
both Traditional and Simplified Chinese. \
 \
This package includes Smart Cangjie 6."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-scj-1.8.12-1.2.noarch.rpm"
RPM_HASH = "05999de46d6bc4b4ad59a5960293d59fc1f5dea51b7f78a3a25410f918a9e1bf34609738851b324ab1ac45471ef2e117f2f504fe8e01d7a8cd5f85b9f0a40aa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-cangjie \
ibus-table-chinese-scj \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
