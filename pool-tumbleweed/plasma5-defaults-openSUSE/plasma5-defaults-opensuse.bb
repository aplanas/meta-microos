SUMMARY = "Default settings for KDE Plasma 5"
DESCRIPTION = "This package changes the default settings of Plasma 5."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20230131T131056~433af24"

RPM_NAME = "plasma5-defaults-openSUSE-84.87~git20230131T131056~433af24-8.1.noarch.rpm"
RPM_HASH = "cc91297c1026a3e803583c9883c9f9e186c1c45bb31d36084b1a3738164830b61b281caf4d1b25f3983655c2e9c48598d0afa56769b40c6da23a317a6d4a591f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-plasma5-defaults-openSUSE \
plasma5-defaults-openSUSE"

RDEPENDS:${PN} += "distribution-logos-openSUSE-icons \
plasma5-theme-openSUSE"

inherit rpm
