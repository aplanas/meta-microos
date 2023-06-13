SUMMARY = "Translations for package spyder"
DESCRIPTION = "Provides translations for the 'spyder' package."
LICENSE = "MIT"

PV = "5.4.3"

RPM_NAME = "spyder-lang-5.4.3-1.1.noarch.rpm"
RPM_HASH = "e49e91ba883bdb79b33dede85837efa9a9ab7c3df51b9a041ce34ff4c882fea4455b585fbf9e776f5a955be2b82198442eeffc02a07b2aa60511b73b26352307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(spyder:de) \
locale(spyder:es) \
locale(spyder:fr) \
locale(spyder:hu) \
locale(spyder:ja) \
locale(spyder:pl) \
locale(spyder:pt_BR) \
locale(spyder:ru) \
locale(spyder:zh_CN) \
spyder-lang \
spyder-lang-all \
spyder3-lang"

RDEPENDS:${PN} += "spyder"

inherit rpm
