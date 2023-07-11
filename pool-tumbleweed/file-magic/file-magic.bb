SUMMARY = "Database for libmagic to help identify files"
DESCRIPTION = "This package contains the basic magic files that libmagic reads and uses \
to estimate a file's type."
LICENSE = "BSD-2-Clause"

PV = "5.44"

RPM_NAME = "file-magic-5.44-2.3.noarch.rpm"
RPM_HASH = "3ec6fc8a33c23dbf4993869f6f496d33a44417a9a5fafe74c28dfb30cecbba335979b5e38b375880ac548a639e68f69b69b690a2123166fd809e2d290fcae2bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-file-magic \
file-magic \
libmagic-data"

RDEPENDS:${PN} += ""

inherit rpm
