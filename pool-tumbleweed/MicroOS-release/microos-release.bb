SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "GPL-2.0-or-later"

PV = "20230801"

RPM_NAME = "MicroOS-release-20230801-1756.1.aarch64.rpm"
RPM_HASH = "0c42bdccc828a0e2016c06cfc5e747c7ded61e7ba741178f11292dc31d0178f63b3d051c62a2b8059df43e6669717eb28f13bf116ed5279c9cf4d310d31240c6"

RPROVIDES:${PN} += "MicroOS-release \
MicroOS-release-20230801 \
distribution-release \
openSUSE-MicroOS-release \
openSUSE-Tumbleweed-Kubic-release \
product- \
product-MicroOS \
product-cpeid- \
product-endoflife- \
product-label- \
product-update- \
product-url-releasenotes \
suse-release \
suse-release-oss \
system-installation-"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
glibc \
product-flavor-MicroOS"

inherit rpm
