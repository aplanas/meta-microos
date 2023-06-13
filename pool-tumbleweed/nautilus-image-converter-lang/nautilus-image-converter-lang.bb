SUMMARY = "Translations for package nautilus-image-converter"
DESCRIPTION = "Provides translations for the 'nautilus-image-converter' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "nautilus-image-converter-lang-0.4.0-1.3.noarch.rpm"
RPM_HASH = "2518836cd536d8727e6c1ca0c79f4a8a37b67f84334c987a2686e74101af3a6b0ae78a607cf6a1cb02a68f3c82f1765f63a49b623ed57a0c188a4f29ccfca317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(nautilus-image-converter:bg) \
locale(nautilus-image-converter:ca) \
locale(nautilus-image-converter:cs) \
locale(nautilus-image-converter:de) \
locale(nautilus-image-converter:es) \
locale(nautilus-image-converter:fi) \
locale(nautilus-image-converter:fr) \
locale(nautilus-image-converter:it) \
locale(nautilus-image-converter:ja) \
locale(nautilus-image-converter:nl) \
locale(nautilus-image-converter:pl) \
locale(nautilus-image-converter:pt_BR) \
locale(nautilus-image-converter:ru) \
locale(nautilus-image-converter:sv) \
nautilus-image-converter-lang \
nautilus-image-converter-lang-all"

RDEPENDS:${PN} += "nautilus-image-converter"

inherit rpm
