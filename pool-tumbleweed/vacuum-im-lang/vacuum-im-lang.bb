SUMMARY = "Translations for package vacuum-im"
DESCRIPTION = "Provides translations for the 'vacuum-im' package."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1571036065.9f3952b2"

RPM_NAME = "vacuum-im-lang-1.3.0+git1571036065.9f3952b2-1.21.noarch.rpm"
RPM_HASH = "1680e2752fa4b75f04f6036bd55656cce97f8ad132ae680a31e8ca6303b498ec8ba165c0b04a082e8d9d68c2baa83b839fbcd8fc2a1b60de0d0fdef44032788f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vacuum-im-lang \
vacuum-im-lang-all"

RDEPENDS:${PN} += "vacuum-im"

inherit rpm
