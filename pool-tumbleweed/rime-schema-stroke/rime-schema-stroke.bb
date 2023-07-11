SUMMARY = "stroke input schema for rime"
DESCRIPTION = "stroke input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-stroke-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "0b34180cd57a83d155aa651c786b2a9e2ab122160b096c222fd2d4f2f5e135b57c48ca76554fe293938572da61882f8011c3f45950a302c2db5b48c620610cd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-stroke"

RDEPENDS:${PN} += ""

inherit rpm
