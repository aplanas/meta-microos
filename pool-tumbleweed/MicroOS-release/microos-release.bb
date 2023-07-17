SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "GPL-2.0-or-later"

PV = "20230712"

RPM_NAME = "MicroOS-release-20230712-1733.1.aarch64.rpm"
RPM_HASH = "16118da81c596eeed5e88355729c9322cf92155988025ae3a5b532c0581ea67039b13330430111beaa8f1a72194bd8ccdb190e2bba0ce067102c4cdeac28cd0b"

RPROVIDES:${PN} += "MicroOS-release \
MicroOS-release-20230712 \
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
