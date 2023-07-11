SUMMARY = "Translations for package gnome-user-docs"
DESCRIPTION = "Provides translations for the 'gnome-user-docs' package."
LICENSE = "CC-BY-3.0"

PV = "44.3"

RPM_NAME = "gnome-user-docs-lang-44.3-1.1.noarch.rpm"
RPM_HASH = "40ae6700fde37c8ed621164f591af5e8a3be1e0718c0a0b1a8f501e9e0d61f1912069e0b0bad108c82b5a0b3b075eba31599722a11381f668c091a8d2499d826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-user-docs-lang \
gnome-user-docs-lang-all"

RDEPENDS:${PN} += "gnome-user-docs"

inherit rpm
