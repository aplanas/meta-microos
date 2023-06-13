SUMMARY = "LastPass command line interface tool"
DESCRIPTION = "LastPass is a freemium password management service which stores encrypted \
passwords in the cloud. This package provided it's command line interface \
tool."
LICENSE = "GPL-2.0-only"

PV = "1.3.4"

RPM_NAME = "lastpass-cli-1.3.4-1.4.aarch64.rpm"
RPM_HASH = "64fc51d47ff5a31d664cdf634989112fe6411313f3262c5bfb2d7c3554218028c7aaf5e808ba1622de55b6369aff6fe77af10a5232a2e5ab5ddb777b74b2f25a"

RPROVIDES:${PN} += "lastpass-cli \
lastpass-cli(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
