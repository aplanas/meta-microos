SUMMARY = "Translations for package libinfinity"
DESCRIPTION = "Provides translations for the 'libinfinity' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libinfinity-lang-0.7.2-4.7.noarch.rpm"
RPM_HASH = "7f32d006de09a0e4e212767eb703c3908144437bc7b5a64a7af9daaa149e127fefed9f78eb2d4d72d57c0f8c6d046e45c31ee40210ce8cbd08ac6dd556543ca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libinfinity-lang \
libinfinity-lang-all \
locale-libinfinity-ca \
locale-libinfinity-de"

RDEPENDS:${PN} += "libinfinity"

inherit rpm
