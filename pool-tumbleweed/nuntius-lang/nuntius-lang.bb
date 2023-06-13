SUMMARY = "Translations for package nuntius"
DESCRIPTION = "Provides translations for the 'nuntius' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "nuntius-lang-0.2.0-3.15.noarch.rpm"
RPM_HASH = "282605313845876520d581296debeef58046e3c229a3ecc079b3e7c23912b646b8eab004f3077054fea3a7f0c6f31e15d7bc55b2108d5ff3ca938e9b22cf00f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(nuntius:de) \
locale(nuntius:es) \
locale(nuntius:pl) \
locale(nuntius:sk) \
nuntius-lang \
nuntius-lang-all"

RDEPENDS:${PN} += "nuntius"

inherit rpm
