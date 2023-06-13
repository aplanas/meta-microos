SUMMARY = "HTCondor is a Distributed High Throughput Computing system"
DESCRIPTION = "HTCondor is a Distributed High Throughput Computing system developed at the \
Center for High Throughput Computing at the University of Wisconsin - Madison. \
With it, users can divide large computing workloads into jobs and submit them \
to an HTCondor scheduler, which will run them on worker nodes managed by \
HTCondor."
LICENSE = "Apache-2.0"

PV = "9.0.16"

RPM_NAME = "htcondor-9.0.16-1.3.aarch64.rpm"
RPM_HASH = "4a2ee2725d25a4ad0502b5f50821f4fffda6f8822235fc15cc12619c66f6f69a4c6f0a0cf814f76d4756fb2b449fd27af9b2c18aa393a1980d38eb1af0515290"

RPROVIDES:${PN} += "config(htcondor) \
group(condor) \
htcondor \
htcondor(aarch-64) \
libchirp_client.so()(64bit) \
libcondor_utils_9_0_16.so()(64bit) \
libcondorapi.so()(64bit) \
libgetpwnam.so()(64bit) \
user(condor)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libclassad.so.15()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libpcre.so.1()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libuuid.so.1()(64bit)"

inherit rpm
