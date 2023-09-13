SUMMARY = "Simple Linux Utility for Resource Management"
DESCRIPTION = "SLURM is a fault-tolerant scalable cluster management and job \
scheduling system for Linux clusters containing up to 65,536 nodes. \
Components include machine status, partition management, job \
management, scheduling and accounting modules."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "5ac0b0e8a69de3cfeefe9e7b91dd3623064a12479625ec663d1e87e307c99e2b1c638971916d3ccc751f9d496526b0d73961ce009caf66ab50b9175c07c7e98b"

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
