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

RPM_NAME = "perl-Net-LibIDN-0.12-16.40.aarch64.rpm"
RPM_HASH = "7323627aaeb1e3ccb3a9a5f7c2c2dc21a64b925267df967e0921bea5abb854d86b16eafa9150ff470e6fa75830110280da79471f8071aabce1e28c4179e5241a"

RPROVIDES:${PN} += "perl-Net--LibIDN \
perl-Net-LibIDN"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libidn.so.12 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
