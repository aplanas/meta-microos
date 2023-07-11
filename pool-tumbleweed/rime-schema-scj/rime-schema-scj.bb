SUMMARY = "scj input schema for rime"
DESCRIPTION = "scj input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-scj-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "f196a0f841ecd970776cc88b38179ca43735f902b86a3d0ea39842886858a4f692ef3a7cd45d03d44175ef5f00a5f6a06ea83603a252a073f75bf13f9f3899f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-scj"

RDEPENDS:${PN} += ""

inherit rpm
