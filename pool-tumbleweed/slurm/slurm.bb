SUMMARY = "Simple Linux Utility for Resource Management"
DESCRIPTION = "SLURM is a fault-tolerant scalable cluster management and job \
scheduling system for Linux clusters containing up to 65,536 nodes. \
Components include machine status, partition management, job \
management, scheduling and accounting modules."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "9b7f2e1bc8bb8b975d2cb3fead86957c89b8d28f6d809bdf79114113d42ca903325f8eda8189bde4164ef1de0689e2fe7a98666440320d829821482870bb87e8"

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
