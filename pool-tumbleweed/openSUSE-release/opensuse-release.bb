SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230801"

RPM_NAME = "openSUSE-release-20230801-1756.1.aarch64.rpm"
RPM_HASH = "47faa86a37eb13c55d6d73bef0cd83706d011309ee69ace1492e5e7c8415be88cfb6b86ae17b2c1bc1e97bac96c89320fb53e70373a57ed5960cc4d9532e3c6e"

RPROVIDES:${PN} += "aaa-version \
config-openSUSE-release \
distribution-release \
openSUSE-release \
openSUSE-release-20230801 \
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
