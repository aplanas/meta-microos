SUMMARY = "Translations for package mednafen"
DESCRIPTION = "Provides translations for the 'mednafen' package."
LICENSE = "GPL-2.0-only"

PV = "1.31.0"

RPM_NAME = "mednafen-lang-1.31.0-1.5.noarch.rpm"
RPM_HASH = "d56b42505bd874c0d71be3963440c4639437035f9f4995bd0039dfe94d54085a9aec37b35d90aa0b1dea529446d8bb042af087c58f9541ad2061fdb4b8b55ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mednafen-de \
locale-mednafen-es \
locale-mednafen-ru \
mednafen-lang \
mednafen-lang-all"

RDEPENDS:${PN} += "mednafen"

inherit rpm
