SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "GPL-2.0-or-later"

PV = "20230904"

RPM_NAME = "MicroOS-release-20230904-1803.1.aarch64.rpm"
RPM_HASH = "92094b8477db49bf92e7578373c03dae89f1cdd15284617cc9a2a9db625eb00a860c3a798c103932e8998e8872ac48e573493316808307b9042233a5cffcc7b4"

RPROVIDES:${PN} += "MicroOS-release \
MicroOS-release-20230904 \
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
