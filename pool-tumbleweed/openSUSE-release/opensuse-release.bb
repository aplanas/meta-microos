SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230604"

RPM_NAME = "openSUSE-release-20230604-1684.1.aarch64.rpm"
RPM_HASH = "6f77cabcd49c7f800ca7ab6c5a0a3d2f805d8986a2d009d0560433644f7803c82efb531351ef181bfe8f5120a91842e9cb5b74df9aceeca3e5e79f5da377ba32"

RPROVIDES:${PN} += "aaa_version \
config(openSUSE-release) \
distribution-release \
openSUSE-release \
openSUSE-release(aarch-64) \
openSUSE-release-20230604 \
product() \
product(openSUSE) \
product-cpeid() \
product-label() \
product-register-target() \
product-update() \
product-url(releasenotes) \
product-url(repository) \
suse-release \
suse-release-oss \
system-installation()"
RDEPENDS:${PN} += "/bin/sh \
product_flavor(openSUSE)"

inherit rpm
