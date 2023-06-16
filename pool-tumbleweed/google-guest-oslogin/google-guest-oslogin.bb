SUMMARY = "Google Cloud Guest OS Login"
DESCRIPTION = "Google Cloud Guest OS Login"
LICENSE = "Apache-2.0"

PV = "20230502.00"

RPM_NAME = "google-guest-oslogin-20230502.00-1.1.aarch64.rpm"
RPM_HASH = "a51edda3d4246d1d3c444ca03c01add00f0aaffa27c45d068f21b641ddb06cf2b257409f7cfef82406916f13b1d0b3c16f5eba317cd4100f40a7106b199d12a9"

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
