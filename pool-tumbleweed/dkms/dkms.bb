SUMMARY = "Dynamic Kernel Module Support Framework"
DESCRIPTION = "This package contains the framework for the Dynamic \
Kernel Module Support (DKMS) method for installing \
module RPMS as originally developed by Dell."
LICENSE = "GPL-2.0-only"

PV = "3.0.11"

RPM_NAME = "dkms-3.0.11-1.1.noarch.rpm"
RPM_HASH = "617ed5f5391238df774c2106be85a39f9ac879ecb8e59d555b4b112f02b96a0b3619c7bfba81ff0148684468f9738f4c6e82b8d60e76c538c3521c878018b30b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dkms \
dkms"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
cpio \
findutils \
gawk \
gcc \
grep \
gzip \
kernel-syms \
make \
mktemp \
modutils \
sed \
systemd \
tar \
zstd"

inherit rpm
