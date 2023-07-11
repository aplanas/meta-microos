SUMMARY = "Translations for package libosinfo"
DESCRIPTION = "Provides translations for the 'libosinfo' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libosinfo-lang-1.10.0-3.4.noarch.rpm"
RPM_HASH = "97144e7d027051503f2c8ebada7fc5dbffa2e4b5caf351c66c539a257714df77360a36cf180a77fc5dda26d37c5bba2b34d190a8bcfb90bc58cbde80c7c30e0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libosinfo-lang \
libosinfo-lang-all \
locale-libosinfo-ca \
locale-libosinfo-cs \
locale-libosinfo-de \
locale-libosinfo-es \
locale-libosinfo-eu \
locale-libosinfo-fi \
locale-libosinfo-fr \
locale-libosinfo-fur \
locale-libosinfo-id \
locale-libosinfo-it \
locale-libosinfo-ja \
locale-libosinfo-ko \
locale-libosinfo-pl \
locale-libosinfo-pt-BR \
locale-libosinfo-pt-PT \
locale-libosinfo-ru \
locale-libosinfo-si \
locale-libosinfo-tr \
locale-libosinfo-uk"

RDEPENDS:${PN} += "libosinfo"

inherit rpm
