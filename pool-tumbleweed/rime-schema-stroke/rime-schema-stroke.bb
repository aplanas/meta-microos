SUMMARY = "stroke input schema for rime"
DESCRIPTION = "stroke input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-stroke-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "5f118718915ac473f9e2ed4c49b20c448952faf2cd25183a8c9926d2564a3f5310a2469118f4492273fa0d89e61be9b7f8a2d92cdadaed6c0e4e861730a0ea4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-stroke"
RDEPENDS:${PN} += ""

inherit rpm
