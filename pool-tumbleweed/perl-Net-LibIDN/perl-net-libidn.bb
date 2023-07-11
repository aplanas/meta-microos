SUMMARY = "Net::LibIDN Perl module"
DESCRIPTION = "This module provides Perl bindings for GNU Libidn by Simon Josefsson \
(http://www.gnu.org/software/libidn/) in way that was heavily inspired by \
PHP bindings for the same library done by Turbo Fredriksson (http://php- \
idn.bayour.com/). \
 \
Authors: \
-------- \
    Thomas Jacob, http://internet24.de"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.12"

RPM_NAME = "perl-Net-LibIDN-0.12-16.39.aarch64.rpm"
RPM_HASH = "e627d3a42b50d4cebd6584f263f47f3f9382cde31da1f0bc40218dd5c075f4a9ad350c94521b02d9c0ffde09ff1de998b5a568493c4324588ce0d6b0365a1f5b"

RPROVIDES:${PN} += "perl-Net--LibIDN \
perl-Net-LibIDN"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libidn.so.12 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
