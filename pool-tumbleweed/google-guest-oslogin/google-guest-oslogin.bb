SUMMARY = "Google Cloud Guest OS Login"
DESCRIPTION = "Google Cloud Guest OS Login"
LICENSE = "Apache-2.0"

PV = "20230808.00"

RPM_NAME = "google-guest-oslogin-20230808.00-1.1.aarch64.rpm"
RPM_HASH = "3eadae455597f0f2c8fa89cdadae87456d73c2c8ac012b80e62b9f114752bc23b9712cd65b06553ca0f313258fb8f271167cd3df3a1129a506f88b44996a4f72"

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
