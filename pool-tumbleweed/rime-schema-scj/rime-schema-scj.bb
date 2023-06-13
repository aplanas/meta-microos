SUMMARY = "scj input schema for rime"
DESCRIPTION = "scj input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-scj-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "52c40a07bb0fd299d38177b742ec1a683da3576dc695951637e37b11b55c5ddcb4748d8225eec76625b6c2bb361ef6390023d09feb9aae6e55d0e25ae96597b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-scj"

RDEPENDS:${PN} += ""

inherit rpm
