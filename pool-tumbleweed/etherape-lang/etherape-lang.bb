SUMMARY = "Translations for package etherape"
DESCRIPTION = "Provides translations for the 'etherape' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.20"

RPM_NAME = "etherape-lang-0.9.20-3.3.noarch.rpm"
RPM_HASH = "8796aaca45e9e797e1454ba55b0f92c7c52d96e9ae617fad901f03c4db366e621fd4d9b3b779ac4564e5e99a8bf2ed89c62059104d1e967f22fd4aa9dc539e02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "etherape-lang \
etherape-lang-all \
locale(etherape:de) \
locale(etherape:es) \
locale(etherape:fr) \
locale(etherape:it) \
locale(etherape:nl) \
locale(etherape:ru) \
locale(etherape:sv) \
locale(etherape:tr)"

RDEPENDS:${PN} += "etherape"

inherit rpm
