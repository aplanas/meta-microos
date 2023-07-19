SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230716"

RPM_NAME = "openSUSE-release-20230716-1738.1.aarch64.rpm"
RPM_HASH = "37f6307e03d7bb3dcf91b49ccc5e47679d4aa5f84dc43d31938f740f5e360dc81a82f2ee7af8d38838f564cf2a6f46a7f8f982fdba1dc486407ef929c8aba2f8"

RPROVIDES:${PN} += "aaa-version \
config-openSUSE-release \
distribution-release \
openSUSE-release \
openSUSE-release-20230716 \
product- \
product-cpeid- \
product-label- \
product-openSUSE \
product-register-target- \
product-update- \
product-url-releasenotes \
product-url-repository \
suse-release \
suse-release-oss \
system-installation-"

RDEPENDS:${PN} += "/usr/bin/sh \
product-flavor-openSUSE"

inherit rpm
