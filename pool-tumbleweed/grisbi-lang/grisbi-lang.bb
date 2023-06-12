SUMMARY = "Translations for package grisbi"
DESCRIPTION = "Provides translations for the 'grisbi' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.5"

RPM_NAME = "grisbi-lang-2.0.5-1.8.noarch.rpm"
RPM_HASH = "cb422daf961c26608ed2b7f413705a6f3d5c177104bd53838e593dfa21d314ea7daf4da611fa4449b9c15e1e238c2d85c2c774108ac8a58ac0f7a56934e0e716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grisbi-lang \
grisbi-lang-all \
locale(grisbi:cs) \
locale(grisbi:da) \
locale(grisbi:de) \
locale(grisbi:el) \
locale(grisbi:en_GB) \
locale(grisbi:en_US) \
locale(grisbi:eo) \
locale(grisbi:es) \
locale(grisbi:fa) \
locale(grisbi:fr) \
locale(grisbi:he) \
locale(grisbi:it) \
locale(grisbi:lv) \
locale(grisbi:nl) \
locale(grisbi:pl) \
locale(grisbi:pt_BR) \
locale(grisbi:ro) \
locale(grisbi:ru) \
locale(grisbi:sv) \
locale(grisbi:zh_CN)"
RDEPENDS:${PN} += "grisbi"

inherit rpm
