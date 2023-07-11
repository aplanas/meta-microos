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

RPM_NAME = "slurm-testsuite-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "eb0cf1bf406391bce84935240a858515ba803fa9f953a21c292e96176b18e082c05e98f31ba8e2e911520eafa15f6d15cb3a32945a6fc3e8fdc6fe9c56a5d837"

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
