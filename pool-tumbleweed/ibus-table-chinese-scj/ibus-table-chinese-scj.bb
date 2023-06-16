SUMMARY = "Smart Cangjie input method"
DESCRIPTION = "Smart Cangjie is an improved Cangjie base input method \
which handles Cangjie, Quick, Cantonese, Chinese punctuation, \
Japanese, 3000 frequent words by Hong Kong government, \
both Traditional and Simplified Chinese. \
 \
This package includes Smart Cangjie 6."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-scj-1.8.12-1.1.noarch.rpm"
RPM_HASH = "eec0feaa4c26afd724a5699486eba7e23ae31a5b9bf6286af53963c58902ab5157ab007302cd5ce47cd403e50105d86f6efb2ecd276214fc762a5b936220b868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-cangjie \
ibus-table-chinese-scj \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
