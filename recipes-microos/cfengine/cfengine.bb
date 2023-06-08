SUMMARY = "Configuration management framework"
DESCRIPTION = "CFEngine is the core of a configuration management system. It \
combines modeling and monitoring to move a system into compliance \
with a user-defined model (the Desired State). A domain-specific \
language is used for setting this up."
LICENSE = "GPL-3.0-only"

PV = "3.21.0"

RPM_NAME = "cfengine-3.21.0-1.4.aarch64.rpm"
RPM_HASH = "2753f0169d8bee956d98554f0336244b790d68d7eaa0f54ddbb484d747b3a629bfe51f9735f11c7f6b8f13257af0c29a06c1180306050f5a36fa0540ad7c511e"

RPROVIDES:${PN} += "cfengine cfengine(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) liblmdb-0.9.30.so()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpcre.so.1()(64bit) libpromises.so.3()(64bit) libpromises3 libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.15)(64bit) libxml2.so.2(LIBXML2_2.7.3)(64bit) systemd"

inherit rpm
