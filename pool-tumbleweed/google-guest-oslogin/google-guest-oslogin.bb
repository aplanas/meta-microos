SUMMARY = "Google Cloud Guest OS Login"
DESCRIPTION = "Google Cloud Guest OS Login"
LICENSE = "Apache-2.0"

PV = "20230823.00"

RPM_NAME = "google-guest-oslogin-20230823.00-1.1.aarch64.rpm"
RPM_HASH = "1817d0bbd895e3529480ced446e1ce52492fc08b8e40f14827ecfa324c0db800dacaa6554bc40b73abc15e13531d944a193364bd465cc3119e72e554a8c783ba"

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
