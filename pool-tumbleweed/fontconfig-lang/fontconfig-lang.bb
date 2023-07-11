SUMMARY = "Translations for package fontconfig"
DESCRIPTION = "Provides translations for the 'fontconfig' package."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "fontconfig-lang-2.14.2-1.4.noarch.rpm"
RPM_HASH = "4f172e778f855bf74f96919a359552852dc4c8e49b56e22990b0bfee80b5a72692bfc6a396fa2922433775bcbab3c429502f5db07f05406349d801de02a4801e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontconfig-lang \
fontconfig-lang-all \
locale-fontconfig-ka \
locale-fontconfig-zh-CN"

RDEPENDS:${PN} += "fontconfig"

inherit rpm
