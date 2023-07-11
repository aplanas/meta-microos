SUMMARY = "A minimal ACMEv2 client"
DESCRIPTION = "uacme is a client for the ACMEv2 protocol described in RFC8555, \
written in plain C code with minimal dependencies. \
The ACMEv2 protocol allows a Certificate Authority and an \
applicant to automate the process of verification and certificate \
issuance. The protocol also provides facilities for other \
certificate management functions, such as certificate revocation."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.4"

RPM_NAME = "uacme-1.7.4-1.1.aarch64.rpm"
RPM_HASH = "96ecfcf84c471f43fca4d5147e3e707c99dbbaea941e79a9630632af5928635c99409571f846627ebfaf3e88c7171583b1c295691fbb6edc523c2e362678298e"

RPROVIDES:${PN} += "uacme"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgnutls.so.30"

inherit rpm
