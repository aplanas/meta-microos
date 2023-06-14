SUMMARY = "BOSCO, a HTCondor overlay system for managing jobs at remote clusters"
DESCRIPTION = "BOSCO allows a locally-installed HTCondor to submit jobs to remote clusters, \
using SSH as a transit mechanism.  It is designed for cases where the remote \
cluster is using a different batch system such as PBS, SGE, LSF, or another \
HTCondor system. \
 \
BOSCO provides an overlay system so the remote clusters appear to be a HTCondor \
cluster.  This allows the user to run their workflows using HTCondor tools across \
multiple clusters."
LICENSE = "Apache-2.0"

PV = "9.0.16"

RPM_NAME = "htcondor-bosco-9.0.16-1.3.aarch64.rpm"
RPM_HASH = "bd8f28c4ef96d4ddd7a7ac0dcb1b518116646ae442c8e23b21ed16d3c56d68af7370574e4a119b3464837cca0207dc6a42c71f2162b68e0c66e05537392ce766"

RPROVIDES:${PN} += "htcondor-bosco"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
htcondor \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclassad.so.15 \
libcondor-utils-9-0-16.so \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
python3 \
rsync"

inherit rpm
