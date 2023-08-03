SUMMARY = "Translations for package criterion"
DESCRIPTION = "Provides translations for the 'criterion' package."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "criterion-lang-2.4.2-1.2.noarch.rpm"
RPM_HASH = "1148cb93c2617dce6fe40ee04503fbfd80fa2e6c1de6b18b68c082b88cc85d506011dfdf227860c5f94a9e728b3d99146af5fae45e7054bca5704561199ef194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "criterion-lang \
criterion-lang-all \
locale-criterion-de \
locale-criterion-fr"

RDEPENDS:${PN} += "criterion"

inherit rpm
