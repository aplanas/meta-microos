SUMMARY = "Application and environment virtualization"
DESCRIPTION = "SingularityCE is the Community Edition of Singularity, an open source \
container platform designed to be simple, fast, and secure."
LICENSE = "Apache-2.0 & BSD-3-Clause-LBNL"

PV = "3.10.2"

RPM_NAME = "singularity-ce-3.10.2-2.5.aarch64.rpm"
RPM_HASH = "980389b57a782de36d6e53098d860be35360600147a39935177e14b516372c2274199491eda5ee09dc97e47df974e7ec97b613a9a0ea4d120acd9a98ebaa84b1"

RPROVIDES:${PN} += "config-singularity-ce \
group-singularity \
singularity \
singularity-ce \
singularity-ce-runtime"

RDEPENDS:${PN} += "/usr/bin/sh \
cryptsetup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libseccomp.so.2 \
permissions \
runc \
squashfs"

inherit rpm
