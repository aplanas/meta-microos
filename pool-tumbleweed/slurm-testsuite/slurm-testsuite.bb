SUMMARY = "Regression tests from Slurm sources"
DESCRIPTION = "NOTE: THIS PACKAGE IS FOR TESTING PURPOSES ONLY. IT REQUIRES A \
DEDICATED TESTING ENVIRONMENT. \
 \
DO NOT INSTALL ON A PRODUCTION SYSTEM! \
 \
Slurm provides a test set implemented as 'expect' scripts. \
Not all of the tests are expected to pass, some require a modified \
configuration. This test package is meant for internal purposes. \
Do not run test suite and file bug reports for each failed test!"
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-testsuite-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "6140e066ca2c61d7b42e4743c2df1de55d5407fb0082a2a7fc07d49620ec8703eb066effaba27c29c2673acfb7717bbaaf898eb8e642b685ff3c385c91027137"

RPROVIDES:${PN} += "config-slurm-testsuite \
slurm-testsuite"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bind-utils \
bzip2 \
expect \
gcc-c++ \
libnuma-devel \
mariadb \
openmpi4-gnu-hpc-devel \
pam \
pdsh \
perl-slurm \
pmix-devel \
slurm \
slurm-auth-none \
slurm-cray \
slurm-devel \
slurm-hdf5 \
slurm-lua \
slurm-munge \
slurm-node \
slurm-openlava \
slurm-rest \
slurm-seff \
slurm-sjstat \
slurm-slurmdbd \
slurm-sql \
slurm-torque \
sudo \
tar"

inherit rpm
