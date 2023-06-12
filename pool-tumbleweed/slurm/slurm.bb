SUMMARY = "Simple Linux Utility for Resource Management"
DESCRIPTION = "SLURM is a fault-tolerant scalable cluster management and job \
scheduling system for Linux clusters containing up to 65,536 nodes. \
Components include machine status, partition management, job \
management, scheduling and accounting modules."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "fec358b1e15f844a29a9f5701e6ba4ac3147ff749fdcde0f570d091ca35a5a31eff457e6e94ce1937a2eab29ebb52d1569b8a94d49f3e6e6a1fedcf018d2986d"

RPROVIDES:${PN} += "slurm \
slurm(aarch-64)"
RDEPENDS:${PN} += "(slurm-munge = 23.02.2 if munge) \
/bin/bash \
/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblz4.so.1()(64bit) \
libreadline.so.8()(64bit) \
libslurmfull.so()(64bit) \
slurm-config \
slurm-node"

inherit rpm