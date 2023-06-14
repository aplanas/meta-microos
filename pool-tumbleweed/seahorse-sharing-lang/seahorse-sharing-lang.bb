SUMMARY = "Translations for package seahorse-sharing"
DESCRIPTION = "Provides translations for the 'seahorse-sharing' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.0"

RPM_NAME = "seahorse-sharing-lang-3.8.0-10.9.noarch.rpm"
RPM_HASH = "09d076278df5bf8f2287c440e2474c9a525ca7c9214484101fe7ccdabadfd051d8ba11c0b52eaf9cf1eecfda7d9260e66001b1a37b068c94759a687f07cada7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-seahorse-sharing-cs \
locale-seahorse-sharing-de \
locale-seahorse-sharing-es \
locale-seahorse-sharing-gl \
locale-seahorse-sharing-hu \
locale-seahorse-sharing-lv \
locale-seahorse-sharing-pl \
locale-seahorse-sharing-pt-BR \
locale-seahorse-sharing-ru \
locale-seahorse-sharing-sl \
locale-seahorse-sharing-sr \
locale-seahorse-sharing-sr@latin \
seahorse-sharing-lang \
seahorse-sharing-lang-all"

RDEPENDS:${PN} += "seahorse-sharing"

inherit rpm
