SUMMARY = "Translations for package goodvibes"
DESCRIPTION = "Provides translations for the 'goodvibes' package."
LICENSE = "GPL-3.0-only"

PV = "0.7.6"

RPM_NAME = "goodvibes-lang-0.7.6-1.3.noarch.rpm"
RPM_HASH = "230235d79c23a298930e47522b4a456c886e0e5bf495eeb7c99a8883e71bc8847414b4eca648ced0d6b3f66f2be1bbcf7dfcff470ab2349c6bd8870b2ac05e92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goodvibes-lang \
goodvibes-lang-all \
locale(goodvibes:ca) \
locale(goodvibes:cs) \
locale(goodvibes:da) \
locale(goodvibes:de) \
locale(goodvibes:en_US) \
locale(goodvibes:es) \
locale(goodvibes:fi) \
locale(goodvibes:fr) \
locale(goodvibes:hr) \
locale(goodvibes:hu) \
locale(goodvibes:id) \
locale(goodvibes:it) \
locale(goodvibes:mr) \
locale(goodvibes:nb_NO) \
locale(goodvibes:nl) \
locale(goodvibes:pl) \
locale(goodvibes:pt) \
locale(goodvibes:pt_BR) \
locale(goodvibes:pt_PT) \
locale(goodvibes:ru) \
locale(goodvibes:sk) \
locale(goodvibes:te) \
locale(goodvibes:tr) \
locale(goodvibes:zh_Hant)"
RDEPENDS:${PN} += "goodvibes"

inherit rpm
