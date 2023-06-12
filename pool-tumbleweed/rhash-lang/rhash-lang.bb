SUMMARY = "Translations for package rhash"
DESCRIPTION = "Provides translations for the 'rhash' package."
LICENSE = "0BSD"

PV = "1.4.3"

RPM_NAME = "rhash-lang-1.4.3-1.5.noarch.rpm"
RPM_HASH = "49983646b597a7912efba255c8501c25a0c9dec304e38e9bb67e147fde51bc8570d0ba778a769efecb2d38b8aefd1451e6cbf35f0d452e4404c0da8fe98f5a81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(rhash:ca) \
locale(rhash:de) \
locale(rhash:en_AU) \
locale(rhash:es) \
locale(rhash:fr) \
locale(rhash:gl) \
locale(rhash:it) \
locale(rhash:ro) \
locale(rhash:ru) \
locale(rhash:uk) \
rhash-lang \
rhash-lang-all"
RDEPENDS:${PN} += "rhash"

inherit rpm
