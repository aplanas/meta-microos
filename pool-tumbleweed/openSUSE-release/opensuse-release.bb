SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230719"

RPM_NAME = "openSUSE-release-20230719-1742.1.aarch64.rpm"
RPM_HASH = "1685c40210d304dcd0eae6254b15d15cb59a7dde399763447ca07e4ee1975cf13326f8a72a3218b46cacc96c4badee4771de2bd1fe2e2b55fdb799a0ec210450"

RPROVIDES:${PN} += "aaa-version \
config-openSUSE-release \
distribution-release \
openSUSE-release \
openSUSE-release-20230719 \
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
