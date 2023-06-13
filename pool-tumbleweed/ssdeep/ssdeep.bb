SUMMARY = "Context Triggered Piecewise Hashing values"
DESCRIPTION = "ssdeep is a program for computing and matching Context Triggered Piecewise \
Hashing values. It is based on a spam detector called spamsum by Andrews \
Trigdell"
LICENSE = "GPL-2.0 & GPL-2.0+"

PV = "2.14.1"

RPM_NAME = "ssdeep-2.14.1-1.23.aarch64.rpm"
RPM_HASH = "3f96d2056c7223d42c806897ab92d29cf85ccb7df6e91552ebf26dec09e772a26fc8c37cb032c2e251dc948fb7c9efaf285d8fc6af7afb06f6972f2bf30f5d48"

RPROVIDES:${PN} += "ssdeep \
ssdeep(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfuzzy.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
