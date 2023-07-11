SUMMARY = "soutzoe input schema for rime"
DESCRIPTION = "soutzoe input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-soutzoe-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "b9e7793961451666667d11d26a114786207ad57bb31ae6469d99f360b7833f33c0e8c8526c18c1059ea02c5214979704f9162610192c9d4d2cb1fbe23f326cb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-soutzoe"

RDEPENDS:${PN} += ""

inherit rpm
