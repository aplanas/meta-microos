SUMMARY = "Translations for package gdbm"
DESCRIPTION = "Provides translations for the 'gdbm' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.23"

RPM_NAME = "gdbm-lang-1.23-1.12.noarch.rpm"
RPM_HASH = "9237f9e37ce663bcc3daf020cf39a4e7758499b162cabef10c0a5d34c50eb38efa89bf23c7b2ff9e5440a1b15259c6800de8a7e622be47f4152fb5e6ae98479f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdbm-lang \
gdbm-lang-all \
locale(gdbm:da) \
locale(gdbm:de) \
locale(gdbm:eo) \
locale(gdbm:es) \
locale(gdbm:fi) \
locale(gdbm:fr) \
locale(gdbm:ja) \
locale(gdbm:pl) \
locale(gdbm:pt_BR) \
locale(gdbm:ru) \
locale(gdbm:sr) \
locale(gdbm:sv) \
locale(gdbm:uk) \
locale(gdbm:vi)"

RDEPENDS:${PN} += "gdbm"

inherit rpm
