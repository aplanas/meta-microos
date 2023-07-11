SUMMARY = "SELinux module for the Access Broker & Resource Manager for TPM 2.0 chips"
DESCRIPTION = "This package provides the SELinux module for the Access Broker & Resource Manager for TPM 2.0 chips."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "tpm2.0-abrmd-selinux-3.0.0-2.2.noarch.rpm"
RPM_HASH = "95feb087ea29b937ef9bb9c0a832865819a1ab5204d495981b63b0cc3f435a80c00e57a624c847191e9c18d2f92e1381d256715f8e7e870140df559f78afb23e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tpm2.0-abrmd-selinux"

RDEPENDS:${PN} += "/usr/bin/sh \
libselinux-utils \
policycoreutils \
policycoreutils-python-utils \
selinux-policy \
selinux-policy-base \
tpm2.0-abrmd"

inherit rpm
