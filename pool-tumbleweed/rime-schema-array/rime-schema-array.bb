SUMMARY = "array input schema for rime"
DESCRIPTION = "array input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-array-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "be4c11a9dd328a01432f7660d8669da8e239221bee1812bdffc901acd05c2844c4a96333dbba745ba78402bc489c73ca7de5052046dbd1aa38d3a3dd988b8df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-array"

RDEPENDS:${PN} += ""

inherit rpm
