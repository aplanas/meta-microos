SUMMARY = "Google Cloud Guest OS Login"
DESCRIPTION = "Google Cloud Guest OS Login"
LICENSE = "Apache-2.0"

PV = "20230502.00"

RPM_NAME = "google-guest-oslogin-20230502.00-1.2.aarch64.rpm"
RPM_HASH = "f1cfabc95efebaaa930730a2b691d558c33f4db299ce6c45c02c6f8bac38c930f764fbc85da5e55289a9836746967429578293f5d7c5a98c754428f949f1a7dc"

RPROVIDES:${PN} += "google-compute-engine-oslogin \
google-guest-oslogin \
libnss-cache-oslogin.so.2 \
libnss-oslogin.so.2"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc \
google-guest-configs \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libjson-c.so.5 \
libpam.so.0 \
libstdc++.so.6 \
openssh \
pam"

inherit rpm
