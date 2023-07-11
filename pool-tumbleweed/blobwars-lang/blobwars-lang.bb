SUMMARY = "Translations for package blobwars"
DESCRIPTION = "Provides translations for the 'blobwars' package."
LICENSE = "GPL-2.0+"

PV = "2.00"

RPM_NAME = "blobwars-lang-2.00-2.23.noarch.rpm"
RPM_HASH = "65c6346acd3ee76a16c397b8bbc4eb4e916f637ff85acdf1307ff72af91873d68413b7f72fd170b29887215ddd0dbe0d593eb7f001be9914774f15c5accfef3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blobwars-lang \
blobwars-lang-all \
locale-blobwars-ca \
locale-blobwars-da \
locale-blobwars-de \
locale-blobwars-es \
locale-blobwars-fr \
locale-blobwars-nl \
locale-blobwars-pl \
locale-blobwars-sv"

RDEPENDS:${PN} += "blobwars"

inherit rpm
