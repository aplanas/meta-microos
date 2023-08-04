SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230802"

RPM_NAME = "openSUSE-release-20230802-1758.1.aarch64.rpm"
RPM_HASH = "b7f51a3cd9444a4deccb3741da1253edb209368d86bb0972ad97b2fdcdfa4cee59ff63f6862ad6fcc72e6dbd5dfee0b831aac62c7d38395a9b8895033cd82618"

RPROVIDES:${PN} += "aaa-version \
config-openSUSE-release \
distribution-release \
openSUSE-release \
openSUSE-release-20230802 \
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
