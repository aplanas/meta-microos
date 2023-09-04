SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "GPL-2.0-or-later"

PV = "20230828"

RPM_NAME = "MicroOS-release-20230828-1789.1.aarch64.rpm"
RPM_HASH = "81d47556c047730aa6101afacdf20f8e3dbb55818050ff572d40931c44f95195981148aa0d0d9431d22c2b85047c702779145e392b3f792471acc681e921bdcb"

RPROVIDES:${PN} += "MicroOS-release \
MicroOS-release-20230828 \
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
