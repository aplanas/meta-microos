SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230712"

RPM_NAME = "openSUSE-release-20230712-1733.1.aarch64.rpm"
RPM_HASH = "c8b2f5faacc8f0b048334509767d82c4fade12d2fe9e59f749e291eff51b6c58972c9308c3f9ae9ad976dbf5133124c4055184cc2356332b996cdf49d20acf3f"

RPROVIDES:${PN} += "aaa-version \
config-openSUSE-release \
distribution-release \
openSUSE-release \
openSUSE-release-20230712 \
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
