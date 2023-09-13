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

PV = "23.02.4"

RPM_NAME = "slurm-testsuite-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "ee14671f03f5e404b48df244b53b2badfcb45e0d46c36bb7355acd5db440a758bb25aacbdc7f2f5636eb6c5d86eea3915fe2648bd67e03246d1434d4ef7b13b4"

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
