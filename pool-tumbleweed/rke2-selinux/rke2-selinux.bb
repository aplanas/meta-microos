SUMMARY = "SELinux policy module for rke2"
DESCRIPTION = "This package installs and sets up the SELinux policy security module for rke2."
LICENSE = "Apache-2.0"

PV = "0.12.stable.1"

RPM_NAME = "rke2-selinux-0.12.stable.1-1.1.noarch.rpm"
RPM_HASH = "7368dab4081d9634f9b73621bab5b18c59082c2ed4b4e576b814401ccf960d431e29bd0d68c6a522fff30c61d95be4abf65366efeccab6c0b75ff79fc14592b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rke2-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
container-selinux \
policycoreutils \
selinux-policy-base \
selinux-tools"

inherit rpm
