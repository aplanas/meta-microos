SUMMARY = "Translations for package blobwars"
DESCRIPTION = "Provides translations for the 'blobwars' package."
LICENSE = "GPL-2.0+"

PV = "2.00"

RPM_NAME = "blobwars-lang-2.00-2.22.noarch.rpm"
RPM_HASH = "0c7194ef273f212aaba4b98c5c42b7e6fc421a108e8a94c62de4ef6dbe4dc8a8dd32b98cf7ca2faf605c3b49c8befe8b71fa742f760e2f2e44977d0de93479be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blobwars-lang \
blobwars-lang-all \
locale(blobwars:ca) \
locale(blobwars:da) \
locale(blobwars:de) \
locale(blobwars:es) \
locale(blobwars:fr) \
locale(blobwars:nl) \
locale(blobwars:pl) \
locale(blobwars:sv)"
RDEPENDS:${PN} += "blobwars"

inherit rpm
