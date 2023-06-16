SUMMARY = "Application and environment virtualization"
DESCRIPTION = "SingularityCE is the Community Edition of Singularity, an open source \
container platform designed to be simple, fast, and secure."
LICENSE = "Apache-2.0 & BSD-3-Clause-LBNL"

PV = "3.10.2"

RPM_NAME = "singularity-ce-3.10.2-2.4.aarch64.rpm"
RPM_HASH = "6a8802154c0582401548179136609bca8673814a2f06c945861483e168f4a5c149ecf80ff8ea94111027d415e85f869fa8e418a38cb3e306e73b9262be0711f8"

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
