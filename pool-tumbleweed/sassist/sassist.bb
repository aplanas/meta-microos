SUMMARY = "Dell SupportAssist log collector"
DESCRIPTION = "Dell SupportAssist log collector for Linux."
LICENSE = "MIT"

PV = "0.8.6"

RPM_NAME = "sassist-0.8.6-1.9.noarch.rpm"
RPM_HASH = "6a7d5289989d7a23b3ebed4974d12e6814c88047bd183f490ac2befbcda286d8f27ab3755ddd2e41dc208e2555de3b329af9742ef0be2d27a11e6d0ec3b076f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sassist"

RDEPENDS:${PN} += "/usr/bin/sh \
freeipmi \
supportutils \
zip"

inherit rpm
