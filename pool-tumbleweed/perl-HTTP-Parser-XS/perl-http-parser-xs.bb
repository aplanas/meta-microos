SUMMARY = "Fast, Primitive Http Request Parser"
DESCRIPTION = "HTTP::Parser::XS is a fast, primitive HTTP request/response parser. \
 \
The request parser can be used either for writing a synchronous HTTP server \
or a event-driven server. \
 \
The response parser can be used for writing HTTP clients. \
 \
Note that even if this distribution name ends '::XS', *pure Perl* \
implementation is supported, so you can use this module on compiler-less \
environments."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-HTTP-Parser-XS-0.17-2.30.aarch64.rpm"
RPM_HASH = "ea42bf6534a3a539197ab6ee9e26364754c455e28c48728e0d45f4bbbb5a09f38c9cfa596477d8868d5d0f11a1257e39240f82bac2c59bf9b7a45c4f3ef5daaa"

RPROVIDES:${PN} += "perl-HTTP--Parser--XS \
perl-HTTP--Parser--XS--PP \
perl-HTTP-Parser-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
