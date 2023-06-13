SUMMARY = "OpenSSL support for LWP"
DESCRIPTION = "This Perl module provides support for the HTTPS protocol under LWP, to \
allow an LWP::UserAgent object to perform GET, HEAD, and POST requests over \
encrypted socket connections. Please see LWP for more information on POST \
requests. \
 \
The 'Crypt::SSLeay' package provides 'Net::SSL', which, if requested, is \
loaded by 'LWP::Protocol::https' for https requests and provides the \
necessary SSL glue."
LICENSE = "Artistic-2.0"

PV = "0.72"

RPM_NAME = "perl-Crypt-SSLeay-0.72-4.20.aarch64.rpm"
RPM_HASH = "128a434313b5598cc49d23c71a4418de5e88aff557adea6a7517587f908137a6988f3473361ceccf7f5fcf7156b15b62326cf9f8d066b7d9d3e14459c6f971da"

RPROVIDES:${PN} += "perl(Crypt::SSLeay) \
perl(Crypt::SSLeay::CTX) \
perl(Crypt::SSLeay::Conn) \
perl(Crypt::SSLeay::Err) \
perl(Crypt::SSLeay::MainContext) \
perl(Crypt::SSLeay::Version) \
perl(Crypt::SSLeay::X509) \
perl(DB) \
perl(Net::SSL) \
perl-Crypt-SSLeay \
perl-Crypt-SSLeay(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
openssl \
perl(:MODULE_COMPAT_5.36.0) \
perl(LWP::Protocol::https)"

inherit rpm
