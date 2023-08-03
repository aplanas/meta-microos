SUMMARY = "YaST2 - Dutch Translations"
DESCRIPTION = "YaST2 - Translations for Dutch."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-nl-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "d6ffec52a985a5daf9cd358ad6ec0b94962adb3184d62d9eb0954cf85998d1cd988937b52d87f9d08b128e5784f7cee9b6a5dcce6a64aa8b60e9bdf7e9382d77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nl \
yast2-trans-nl"

RDEPENDS:${PN} += ""

inherit rpm
