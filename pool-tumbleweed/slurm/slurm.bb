SUMMARY = "Simple Linux Utility for Resource Management"
DESCRIPTION = "SLURM is a fault-tolerant scalable cluster management and job \
scheduling system for Linux clusters containing up to 65,536 nodes. \
Components include machine status, partition management, job \
management, scheduling and accounting modules."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "a45f9dcb02d293927fb2cb47e7679fa3097c5c653e179b9be150cb68af26d60b083d0d9bb6b7f2c864ac0d5dda7c6b6fba7292d73072f9477d47850f1d8fe8fb"

RPROVIDES:${PN} += "slurm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
libreadline.so.8 \
libslurmfull.so \
slurm-config \
slurm-node"

inherit rpm
