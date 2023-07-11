SUMMARY = "Rime's configuration manager"
DESCRIPTION = "Plum is rime's configuration manager."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-plum-20230603+git.5fdd2d6-1.2.aarch64.rpm"
RPM_HASH = "e1ec30d31e86dfe20b44cfb3aa5cdababc3456733ae0e760432400459f6dc9fabd71f44de8ba590cf17e75a27d8417a3181cf655f2f73b956e67a8419512446a"

RPROVIDES:${PN} += "rime-plum"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
