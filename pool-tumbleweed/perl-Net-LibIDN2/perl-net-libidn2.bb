SUMMARY = "Perl bindings for GNU Libidn2"
DESCRIPTION = "Provides bindings for GNU Libidn2, a C library for handling \
internationalized domain names based on IDNA 2008, Punycode and TR46."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-Net-LibIDN2-1.02-1.2.aarch64.rpm"
RPM_HASH = "eb2b22cf7bbf15735797ff0a79eaf47740e7dcbb85403ce134a684fade47d4f67d7bd086b170312db340d4b0ef98b4cb068ce321dfc2c3503310febf52bb115e"

RPROVIDES:${PN} += "perl-Net--LibIDN2 \
perl-Net-LibIDN2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libidn2.so.0 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
