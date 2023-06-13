SUMMARY = "Translations for package NetworkManager-iodine"
DESCRIPTION = "Provides translations for the 'NetworkManager-iodine' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "NetworkManager-iodine-lang-1.2.0-7.3.noarch.rpm"
RPM_HASH = "57b818961cabd03fb47522b1bc24a6b3b07119fa97f0e4e4779e42b02ddb5d82d2ea7822a562ec0f2c72147491baed4467c318c936cb3e827735fbef24b15eeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-iodine-lang \
NetworkManager-iodine-lang-all \
locale(NetworkManager-iodine:bs) \
locale(NetworkManager-iodine:ca) \
locale(NetworkManager-iodine:cs) \
locale(NetworkManager-iodine:de) \
locale(NetworkManager-iodine:el) \
locale(NetworkManager-iodine:es) \
locale(NetworkManager-iodine:hu) \
locale(NetworkManager-iodine:id) \
locale(NetworkManager-iodine:it) \
locale(NetworkManager-iodine:ja) \
locale(NetworkManager-iodine:lt) \
locale(NetworkManager-iodine:lv) \
locale(NetworkManager-iodine:pa) \
locale(NetworkManager-iodine:pl) \
locale(NetworkManager-iodine:pt) \
locale(NetworkManager-iodine:pt_BR) \
locale(NetworkManager-iodine:sl) \
locale(NetworkManager-iodine:sr) \
locale(NetworkManager-iodine:sr@latin) \
locale(NetworkManager-iodine:sv) \
locale(NetworkManager-iodine:tr)"

RDEPENDS:${PN} += "NetworkManager-iodine"

inherit rpm
