SUMMARY = "Languages for package barrel"
DESCRIPTION = "Provides translations to the package barrel"
LICENSE = "GPL-2.0-only"

PV = "0.2.0"

RPM_NAME = "barrel-lang-0.2.0-1.3.noarch.rpm"
RPM_HASH = "c29b3693389a9fe9777443a91c371914a191fb1f2de94bd630290dabef3f2affa6f7f2cab4dceb1e5d5661b2340c98f660028362d7413a9b45006a39f8a4ac56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "barrel-lang \
barrel-lang-all \
locale(barrel:ca) \
locale(barrel:cs) \
locale(barrel:da) \
locale(barrel:de) \
locale(barrel:es) \
locale(barrel:fr) \
locale(barrel:it) \
locale(barrel:ja) \
locale(barrel:mk) \
locale(barrel:pt_BR) \
locale(barrel:zh_CN) \
locale(barrel:zh_TW)"

RDEPENDS:${PN} += ""

inherit rpm
