SUMMARY = "The 'array' input methods for Chinese"
DESCRIPTION = "Array input method is a character-structured input method, including: \
array30: 27489 characters. \
array30-big: 27489 characters + Unicode ExtB."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-array-1.8.12-1.2.noarch.rpm"
RPM_HASH = "5f020b5c731c98c028eaa94cf7cb6433378d3bd5bb1c01ac3c0cc7f2b186c9192bf64a3d836af403956be8fa92919f3580718d11d6b074bb2f5b07062c005f8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-array30 \
ibus-table-chinese-array \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
