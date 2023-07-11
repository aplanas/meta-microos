SUMMARY = "essay input schema for rime"
DESCRIPTION = "essay input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-essay-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "c0ba148d7a07cf98ff22a422e04ff1bd4b783a2eadad9d84a37409db12cfe24fc663dad50792197dce08430bcab3010190a4fbd7b85bc7da8d46d94c3c805518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-essay"

RDEPENDS:${PN} += ""

inherit rpm
