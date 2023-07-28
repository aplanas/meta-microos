SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "GPL-2.0-or-later"

PV = "20230719"

RPM_NAME = "MicroOS-release-20230719-1742.1.aarch64.rpm"
RPM_HASH = "f00cc457f3e1b30413c867fd6e650ca136c78cd2de6788250f97f1432a415e7e1e0ec935eab8f85f122a8681d0d687518e55aca2979500dfd0f4be60c9375d8a"

RPROVIDES:${PN} += "MicroOS-release \
MicroOS-release-20230719 \
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
