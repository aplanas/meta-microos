SUMMARY = "stenotype input schema for rime"
DESCRIPTION = "stenotype input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-stenotype-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "beaefd5fe2dd118316440fd4b19b96dc1acb8e1fbec5fbee07a336cea6310d2a6583d8fb8e51b57b9f17c1b4efc08b37b960bac0c7aceb8d3737de9fa6b2cf06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-stenotype"

RDEPENDS:${PN} += ""

inherit rpm
