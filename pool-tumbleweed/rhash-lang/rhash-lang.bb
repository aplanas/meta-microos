SUMMARY = "Translations for package rhash"
DESCRIPTION = "Provides translations for the 'rhash' package."
LICENSE = "0BSD"

PV = "1.4.3"

RPM_NAME = "rhash-lang-1.4.3-1.6.noarch.rpm"
RPM_HASH = "3f7fd0b50b21b7e6f0ca4b8271a01f0b45ca7b1cd48e99f4af288270c762f6bb185baee147c651d7ca21163708ca349205317b44335dd57bbff69856bb9a2783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rhash-ca \
locale-rhash-de \
locale-rhash-en-AU \
locale-rhash-es \
locale-rhash-fr \
locale-rhash-gl \
locale-rhash-it \
locale-rhash-ro \
locale-rhash-ru \
locale-rhash-uk \
rhash-lang \
rhash-lang-all"

RDEPENDS:${PN} += "rhash"

inherit rpm
