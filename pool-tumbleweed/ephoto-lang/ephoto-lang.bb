SUMMARY = "Translations for package ephoto"
DESCRIPTION = "Provides translations for the 'ephoto' package."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ephoto-lang-1.5-1.28.noarch.rpm"
RPM_HASH = "3bff0d78056b8ce9c90fe92b7344ef63f873e54744af4212220a21b487f1bb12a778eb9454eaa448e8cfa2ee00c88595169fbe870d615c6017a6d5347dc35661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ephoto-lang \
ephoto-lang-all \
locale(ephoto:cs) \
locale(ephoto:de) \
locale(ephoto:fr) \
locale(ephoto:it) \
locale(ephoto:sk) \
locale(ephoto:sl)"

RDEPENDS:${PN} += "ephoto"

inherit rpm
