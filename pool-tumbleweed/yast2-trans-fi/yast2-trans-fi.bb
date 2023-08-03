SUMMARY = "YaST2 - Finnish Translations"
DESCRIPTION = "YaST2 - Finnish translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-fi-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "87f214eb5decdb94c1b1e7f688356a12f7d74ccc0cdd224751e561101bcef3d12ec059fa552392ba175eb51f3d0b4b1eef53e21e3165c4e63ea4c71f1f275661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fi \
yast2-trans-fi"

RDEPENDS:${PN} += ""

inherit rpm
