SUMMARY = "Documentation files for libcomps library"
DESCRIPTION = "Documentation files for libcomps library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.19"

RPM_NAME = "libcomps-doc-0.1.19-2.4.noarch.rpm"
RPM_HASH = "3eba83d9026fed7713e57eb5f77e41e9e326b29f3fd989200b25ae59322d3ad985bb30d2978d369704c4a03334edfd3364b4a999426f4c3ac56915c6a00c0f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcomps-doc"

RDEPENDS:${PN} += ""

inherit rpm
