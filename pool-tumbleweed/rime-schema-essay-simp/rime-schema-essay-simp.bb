SUMMARY = "simplified essay input schema for rime"
DESCRIPTION = "simplified essay input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-essay-simp-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "20f6d33904869e9129ec70c8696de162b39d5aa18e3933b6c71f24c8a6dea4d093febd0090a2c9bfc7ba504cf1945ad1d7e74ec41c064e9880d327c257fc8177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-essay-simp"

RDEPENDS:${PN} += ""

inherit rpm
