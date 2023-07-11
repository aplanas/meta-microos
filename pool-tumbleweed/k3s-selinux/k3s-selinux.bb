SUMMARY = "SELinux policy module for k3s"
DESCRIPTION = "This package installs and sets up the SELinux policy security module for k3s."
LICENSE = "Apache-2.0"

PV = "1.4.stable.1"

RPM_NAME = "k3s-selinux-1.4.stable.1-1.1.noarch.rpm"
RPM_HASH = "ddb0e7fd2d511e5b35c5ccdfe0e497c4ad6b33338dc7427b8bce3bd9bd9093d7c4071ca00f8bbdea496a999c15e8472628b21d61278616cc2f6fceb553704975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k3s-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
container-selinux \
policycoreutils \
selinux-policy-base \
selinux-tools"

inherit rpm
