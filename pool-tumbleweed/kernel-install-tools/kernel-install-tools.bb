SUMMARY = "Useful tools for installing self-built kernels"
DESCRIPTION = "A collection of tools useful for installing self-built kernels. \
 \
In addition to the baseline /sbin/installkernel, this package includes \
several tools for properly signing and installing kernels and certificates \
for use on systems with UEFI Secure Boot enabled."
LICENSE = "GPL-2.0-only"

PV = "0.3.0"

RPM_NAME = "kernel-install-tools-0.3.0-2.2.aarch64.rpm"
RPM_HASH = "0d08500e545a36c8770ff7cb49aef0cfecc2124afbd1083f3f56727e3fa7e5c19f2d0bb569db4096372520666b36b6ea6a468d54e914451d87f013397e66ccb1"

RPROVIDES:${PN} += "kernel-install-tools"

RDEPENDS:${PN} += "/bin/bash \
mozilla-nss-tools \
openssl \
pesign"

inherit rpm
