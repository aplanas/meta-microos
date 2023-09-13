SUMMARY = "Documentation for the GNU Core Utilities"
DESCRIPTION = "This package contains the documentation for the GNU Core Utilities."
LICENSE = "GPL-3.0-or-later"

PV = "9.4"

RPM_NAME = "coreutils-doc-9.4-1.1.noarch.rpm"
RPM_HASH = "942488db3422af7949a0a74af0aeff2cf549071c1a7b117c4193de216982242d30917ff06db69ff57786e43e75c9a8ae6077f9a9dd551de40f82b550d25c95bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coreutils-/usr/share/info/coreutils.info.gz \
coreutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
