SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "GPL-2.0-or-later"

PV = "20230802"

RPM_NAME = "MicroOS-release-20230802-1758.1.aarch64.rpm"
RPM_HASH = "8f6ee2d34ca91dba7a2621b18e88f2e03a59abee48f0e74be92a6c60800809862eb684ebbf30c7af4866eab0d8bfba99d1b5bffac5bba81777ce3ee6ccef9455"

RPROVIDES:${PN} += "MicroOS-release \
MicroOS-release-20230802 \
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
