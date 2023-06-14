SUMMARY = "Files for developing applications using surgescript"
DESCRIPTION = "This package contains files required for \
developing applications using surgescript."
LICENSE = "Apache-2.0 & BSD-1-Clause & BSD-2-Clause & SUSE-Public-Domain"

PV = "0.5.6.1"

RPM_NAME = "libsurgescript0_5_6-0.5.6.1-2.3.aarch64.rpm"
RPM_HASH = "6a464889658da4f7df3b119fb830a5bda601c82d4b7329ff6b5e76e240cdba3ab987cd04beb5051d01bfdcfb893ba7bf21c035de4c8870a315045cc27b7c1d7b"

RPROVIDES:${PN} += "libsurgescript.so.0.5.6 \
libsurgescript0-5-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
