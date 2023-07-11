SUMMARY = "basic schema to customize rime"
DESCRIPTION = "basic schema to customize rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-custom-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "bf262f0afb4b4193c356ee5feaf09c42813407a95a9c1b1ef22f31dac30454799a1e61fe8cf0228476328fe85bebc5f33f857fdaa6f0cbb4dfd567f358157b44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-custom"

RDEPENDS:${PN} += ""

inherit rpm
