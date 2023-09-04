SUMMARY = "Advanced Intrusion Detection Environment"
DESCRIPTION = "AIDE is an intrusion detection system that checks file integrity."
LICENSE = "GPL-2.0-or-later"

PV = "0.18.6"

RPM_NAME = "aide-0.18.6-1.1.aarch64.rpm"
RPM_HASH = "bcbbf143165fb2679333eb698e11fc99ab5ce1da9cfc6e80b9400d764d68ad420130c27b1c1fa1038d9586db8eeebff5158e49187528ac7811f4375152cd1980"

RPROVIDES:${PN} += "aide \
config-aide"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libm.so.6 \
libpcre2-8.so.0 \
libselinux.so.1 \
libz.so.1"

inherit rpm
