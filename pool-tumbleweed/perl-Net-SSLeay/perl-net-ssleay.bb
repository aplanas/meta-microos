SUMMARY = "Perl bindings for OpenSSL and LibreSSL"
DESCRIPTION = "This module provides Perl bindings for libssl (an SSL/TLS API) and \
libcrypto (a cryptography API)."
LICENSE = "Artistic-2.0"

PV = "1.92"

RPM_NAME = "perl-Net-SSLeay-1.92-1.10.aarch64.rpm"
RPM_HASH = "01bb68f656cbb5176bc7ad3de3bde482e4030a76d91ba121f9731f4d630035b5fc06efc042f62493343c1d2c3f3297d845ef59bfa5866d8179e129e50c5a0675"

RPROVIDES:${PN} += "perl(Net::SSLeay) \
perl(Net::SSLeay::Handle) \
perl-Net-SSLeay \
perl-Net-SSLeay(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libssl.so.3()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
