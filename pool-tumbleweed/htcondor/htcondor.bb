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

RPROVIDES:${PN} += "config-htcondor \
group-condor \
htcondor \
libchirp-client.so \
libcondor-utils-9-0-16.so \
libcondorapi.so \
libgetpwnam.so \
user-condor"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclassad.so.15 \
libcrypto.so.3 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libpcre.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
