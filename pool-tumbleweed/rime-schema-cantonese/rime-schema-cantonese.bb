SUMMARY = "cantonese input schema for rime"
DESCRIPTION = "cantonese(jyutping) input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-cantonese-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "224f429fba4fb2d29267c1587ae0f8024604bd7020b68e74651e1baa9bfc6a855f614e7ef9f63f2f37e59289f44dc7f5550bd834be28aae4abd4f2f488f5492f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-cantonese \
rime-schema-jyutping"

RDEPENDS:${PN} += ""

inherit rpm
