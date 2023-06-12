SUMMARY = "Translations for package minitube"
DESCRIPTION = "Provides translations for the 'minitube' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "minitube-lang-3.9.3-1.8.noarch.rpm"
RPM_HASH = "1f47117ff63d94e6cec01949d8220836c9406d4bed67afa50992b54746b39a45457a23dc9c016f03d136d04a297b5d858577fd5d8252f9d21f2f36873c28e3b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minitube-lang \
minitube-lang-all"
RDEPENDS:${PN} += "minitube"

inherit rpm
