SUMMARY = "SELinux policy module for rke2"
DESCRIPTION = "This package installs and sets up the SELinux policy security module for rke2."
LICENSE = "Apache-2.0"

PV = "0.14.stable.1"

RPM_NAME = "rke2-selinux-0.14.stable.1-1.1.noarch.rpm"
RPM_HASH = "750d83614bf83307346aa4bb1d401f4ed8cb8e7ed1714e17f317c8f8596e30becd5078805ec9c3d22e02ee8ec1d330c9c056cb0ad0ba76fd2006c96c45ce0e58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rke2-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
container-selinux \
policycoreutils \
selinux-policy-base \
selinux-tools"

inherit rpm
