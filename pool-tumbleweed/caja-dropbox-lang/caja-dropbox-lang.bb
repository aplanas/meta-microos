SUMMARY = "Translations for package caja-dropbox"
DESCRIPTION = "Provides translations for the 'caja-dropbox' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.26.0"

RPM_NAME = "caja-dropbox-lang-1.26.0-1.9.noarch.rpm"
RPM_HASH = "8aa886c505e71fa837590768383d69e3897066b0bdf69f4c2d1ba96d7d51e27e205f9bbd6d778910a82faaea86e58f0bc6768db60410c6634ff7ec8212b2dfb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-dropbox-lang \
caja-dropbox-lang-all \
locale(caja-dropbox:ca) \
locale(caja-dropbox:cs) \
locale(caja-dropbox:da) \
locale(caja-dropbox:es) \
locale(caja-dropbox:fr) \
locale(caja-dropbox:id) \
locale(caja-dropbox:it) \
locale(caja-dropbox:ja) \
locale(caja-dropbox:ko) \
locale(caja-dropbox:ms) \
locale(caja-dropbox:nb) \
locale(caja-dropbox:nl) \
locale(caja-dropbox:oc) \
locale(caja-dropbox:pl) \
locale(caja-dropbox:sr) \
locale(caja-dropbox:sv) \
locale(caja-dropbox:uk)"
RDEPENDS:${PN} += "caja-dropbox"

inherit rpm
