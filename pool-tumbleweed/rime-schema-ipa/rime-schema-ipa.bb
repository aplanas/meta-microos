SUMMARY = "ipa input schema for rime"
DESCRIPTION = "ipa input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-ipa-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "fbec0273beb3601b3d8ea387ced37ca2f4a6b3ff08de5f950218f1ab9b1d7424d1f56278cf6757fa464c7d8674a36da14a89644e222c0f89025d7f1fdacd6553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-ipa"

RDEPENDS:${PN} += ""

inherit rpm
