SUMMARY = "Translations for package fldigi"
DESCRIPTION = "Provides translations for the 'fldigi' package."
LICENSE = "GPL-3.0-only"

PV = "4.1.27"

RPM_NAME = "fldigi-lang-4.1.27-1.1.noarch.rpm"
RPM_HASH = "36c94ec11954f98089c8fe3b89b786c0d03d76bccbbd0d59d9e2dbacc444f2fc80356e2c64c6f350378884aeeb5f1832d1b378381c4360e4506e43e8acbed642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fldigi-lang \
fldigi-lang-all \
locale-fldigi-de \
locale-fldigi-el \
locale-fldigi-es \
locale-fldigi-fr \
locale-fldigi-it \
locale-fldigi-nl \
locale-fldigi-pl \
locale-fldigi-ru"

RDEPENDS:${PN} += "fldigi"

inherit rpm
