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

RPM_NAME = "perl-Crypt-SSLeay-0.72-4.22.aarch64.rpm"
RPM_HASH = "bec206bd0f4198075149510dcf62d52bd22b8df945d31b74cdd3914724784d395647a8bc232a7edfc8dc8211f7e9e2b5a1c8f09d4e684a62edfb2b8a959a449a"

RPROVIDES:${PN} += "perl-Crypt--SSLeay \
perl-Crypt--SSLeay--CTX \
perl-Crypt--SSLeay--Conn \
perl-Crypt--SSLeay--Err \
perl-Crypt--SSLeay--MainContext \
perl-Crypt--SSLeay--Version \
perl-Crypt--SSLeay--X509 \
perl-Crypt-SSLeay \
perl-DB \
perl-Net--SSL"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
openssl \
perl--MODULE-COMPAT-5.36.1 \
perl-LWP--Protocol--https"

inherit rpm
