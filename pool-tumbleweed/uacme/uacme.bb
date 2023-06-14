SUMMARY = "A minimal ACMEv2 client"
DESCRIPTION = "uacme is a client for the ACMEv2 protocol described in RFC8555, \
written in plain C code with minimal dependencies. \
The ACMEv2 protocol allows a Certificate Authority and an \
applicant to automate the process of verification and certificate \
issuance. The protocol also provides facilities for other \
certificate management functions, such as certificate revocation."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.3"

RPM_NAME = "uacme-1.7.3-1.3.aarch64.rpm"
RPM_HASH = "573f7e84cc965973c4bd726c4214324ebfd24ccdae4f9700bfc6efb54b09b57786a93f5844d4ecf8b7dfcbab2092b0c9d78be6ad2d2cccd8599bb2f3281fe555"

RPROVIDES:${PN} += "uacme"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgnutls.so.30"

inherit rpm
