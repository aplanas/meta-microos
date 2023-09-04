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

RPM_NAME = "perl-Crypt-SSLeay-0.72-4.23.aarch64.rpm"
RPM_HASH = "f3a030db9182ee54cc1fec956976695da0c93f5ac002fd3726edc0546265312ba615cab3acb577c64f56379d05aeccbcce09b0d695eeb5ac756573f82618cd09"

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
perl--MODULE-COMPAT-5.38.0 \
perl-LWP--Protocol--https"

inherit rpm
