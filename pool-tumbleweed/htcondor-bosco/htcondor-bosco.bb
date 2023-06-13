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

RPROVIDES:${PN} += "htcondor-bosco \
htcondor-bosco(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
htcondor \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclassad.so.15()(64bit) \
libcondor_utils_9_0_16.so()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
python3 \
rsync"

inherit rpm
