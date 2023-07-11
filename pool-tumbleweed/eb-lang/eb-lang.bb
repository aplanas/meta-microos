SUMMARY = "Translations for package eb"
DESCRIPTION = "Provides translations for the 'eb' package."
LICENSE = "GPL-2.0+"

PV = "4.4.3"

RPM_NAME = "eb-lang-4.4.3-3.29.noarch.rpm"
RPM_HASH = "b4b68f9edad4859e805ca68e95aad3e471cf39d3dcf7e71efc8d1cfb88cab66f47c6b631c381ce8245f53c1258da3f994d8306ce785b1bda43ad57dcb6bd4ba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eb-lang \
eb-lang-all \
locale-eb-ja"

RDEPENDS:${PN} += "eb"

inherit rpm
