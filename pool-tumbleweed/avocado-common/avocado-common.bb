SUMMARY = "Avocado Test Framework"
DESCRIPTION = "Avocado is a set of tools and libraries (what people call these days a \
framework) to perform automated testing. \
 \
This package contains common infrastructure files."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "avocado-common-69.0-6.11.noarch.rpm"
RPM_HASH = "bc965c2f7f1110f91e07b1d69441fd988e019f91d4e642154807953106a03e1fd692bebe64b12df3175b21336d0f680402e0734612dd76c5e2900cd6e030afaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avocado-common \
config-avocado-common"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
