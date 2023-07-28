SUMMARY = "YaST2 - Thai Translations"
DESCRIPTION = "YaST2 - Thai translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-th-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "877c70aff2e4e5f159f59b3a4681d193d55ca8ab06b1da54ac8ff46018315dccd179b17855af2df1ab3dc96d9229db62013c2d5b445fb1f7f281c064c7d5f6cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-th \
yast2-trans-th"

RDEPENDS:${PN} += ""

inherit rpm
