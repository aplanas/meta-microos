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

RPM_NAME = "perl-HTTP-Parser-XS-0.17-2.29.aarch64.rpm"
RPM_HASH = "47c71342f92f61a58e5ab4158a133fd0a933ed4e0a3a5097c1dd8ef2c27b835a16e61e7f9fdf5a09ef57f19a4e52f1c37fed8194284155b6df3de94aba71bd6a"

RPROVIDES:${PN} += "perl-HTTP--Parser--XS \
perl-HTTP--Parser--XS--PP \
perl-HTTP-Parser-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
