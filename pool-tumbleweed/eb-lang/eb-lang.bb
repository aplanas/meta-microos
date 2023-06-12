SUMMARY = "Translations for package eb"
DESCRIPTION = "Provides translations for the 'eb' package."
LICENSE = "GPL-2.0+"

PV = "4.4.3"

RPM_NAME = "eb-lang-4.4.3-3.28.noarch.rpm"
RPM_HASH = "f768a209147748c9cf1d7dbbd98b458c1290a9a296c5f190d665d7f9b13cc19f7082669b007271b8d384be03fd0427f032ef28a0b7b2a42b8220d40888c0089d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eb-lang \
eb-lang-all \
locale(eb:ja)"
RDEPENDS:${PN} += "eb"

inherit rpm
