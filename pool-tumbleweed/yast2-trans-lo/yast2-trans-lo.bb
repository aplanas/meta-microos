SUMMARY = "YaST2 - Lao Translations"
DESCRIPTION = "YaST2 - Translations for Lao."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-lo-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "bde4d14cf4dab4751aa8e2d6ddaf3ad54af652c66dc4ef2542b677a71fd1dd1cfd4bc7d883b3fb91277eb2186809fb9d75946f937aea17cf3fd5b3efa0844fe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lo \
yast2-trans-lo"

RDEPENDS:${PN} += ""

inherit rpm
