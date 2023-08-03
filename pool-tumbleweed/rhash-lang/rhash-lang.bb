SUMMARY = "Translations for package rhash"
DESCRIPTION = "Provides translations for the 'rhash' package."
LICENSE = "0BSD"

PV = "1.4.4"

RPM_NAME = "rhash-lang-1.4.4-1.1.noarch.rpm"
RPM_HASH = "ee6fdc401b11d6dca71f28b39228aa69b1eb76a0e00623d3b52cdb5d50ef376c1815fc24d53c02c7e914d8aa06872cabb9e77fed63b9541fd9c9a147c8348155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rhash-ca \
locale-rhash-de \
locale-rhash-en-AU \
locale-rhash-es \
locale-rhash-fr \
locale-rhash-gl \
locale-rhash-it \
locale-rhash-ro \
locale-rhash-ru \
locale-rhash-uk \
rhash-lang \
rhash-lang-all"

RDEPENDS:${PN} += "rhash"

inherit rpm
