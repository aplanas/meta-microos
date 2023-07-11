SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "GPL-2.0-or-later"

PV = "20230707"

RPM_NAME = "MicroOS-release-20230707-1726.1.aarch64.rpm"
RPM_HASH = "671165e90b470c146a61096ac40750fc966b212bdf8a0a5fb8f5bdb59493fe926d47fa29c7acd9b8997d4a455438f265b88447cc9a476518224c3b9ce4d8cd6f"

RPROVIDES:${PN} += "MicroOS-release \
MicroOS-release-20230707 \
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
