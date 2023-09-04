SUMMARY = "Perl bindings for GNU Libidn2"
DESCRIPTION = "Provides bindings for GNU Libidn2, a C library for handling \
internationalized domain names based on IDNA 2008, Punycode and TR46."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-Net-LibIDN2-1.02-1.3.aarch64.rpm"
RPM_HASH = "fbb2b1398eae53e9a6f5f5571f71b2ddf55409c42d9226d3a90a06390c01e8a503e1d5c8c8eaf89a1e77539d032c71fc4cf4d87191578b622e0109276b44d9f8"

RPROVIDES:${PN} += "perl-Net--LibIDN2 \
perl-Net-LibIDN2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libidn2.so.0 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
