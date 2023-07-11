SUMMARY = "Provides an interface for RFC 2253 style DN strings"
DESCRIPTION = "X500::DN Provides a pure perl parser and formatter for RFC 2253 style \
DN strings. \
 \
 \
 \
Authors: \
-------- \
    Robert Joop <yaph-020416@timesink.de>"
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "0.29"

RPM_NAME = "perl-X500-DN-0.29-109.15.aarch64.rpm"
RPM_HASH = "5373828c7fcb8b8badc6e6f32ae6579b346606d32960bc9b0ce6cda8d10a06b7f64580f762c271dd9a4e222e165b671f6c4a9681a203d51127e089309b9b1d9b"

RPROVIDES:${PN} += "perl-X500--DN \
perl-X500--RDN \
perl-X500-DN"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Parse-RecDescent"

inherit rpm
