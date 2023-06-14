SUMMARY = "The 'array' input methods for Chinese"
DESCRIPTION = "Array input method is a character-structured input method, including: \
array30: 27489 characters. \
array30-big: 27489 characters + Unicode ExtB."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-array-1.8.12-1.1.noarch.rpm"
RPM_HASH = "f37ff05c2362dffab8c4bb255ba0d11a05bcbc27b9461ea565292813b6904ab1ecedd12c84bc082e354e771faf1f1698999e1b21ae8fd29d0afeaaf01ad6411e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-array30 \
ibus-table-chinese-array \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/bin/sh \
ibus-table"

inherit rpm
