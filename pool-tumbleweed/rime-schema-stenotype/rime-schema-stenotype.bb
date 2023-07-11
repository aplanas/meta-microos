SUMMARY = "stenotype input schema for rime"
DESCRIPTION = "stenotype input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-stenotype-20230603+git.5fdd2d6-1.2.noarch.rpm"
RPM_HASH = "283e1eed57a161f85a97f792585560411960876cce1969a2308fb8fa4ed8b5b51ef89b5579baff748319fe77cd7b50e9074727ea423104131047ad9755a1beb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-stenotype"

RDEPENDS:${PN} += ""

inherit rpm
