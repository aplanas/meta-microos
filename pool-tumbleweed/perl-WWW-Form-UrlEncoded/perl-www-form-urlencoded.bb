SUMMARY = "Parser and builder for application/x-www-form-urlencoded"
DESCRIPTION = "WWW::Form::UrlEncoded provides application/x-www-form-urlencoded parser and \
builder. This module aims to have compatibility with other CPAN modules \
like HTTP::Body's urlencoded parser. \
 \
This module try to use WWW::Form::UrlEncoded::XS by default and fail to it, \
use WWW::Form::UrlEncoded::PP instead"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.26"

RPM_NAME = "perl-WWW-Form-UrlEncoded-0.26-1.14.aarch64.rpm"
RPM_HASH = "532005302c04aed3dd8a09d849ecd09bea7c0a972e2abafc1ff54d548624dba2478ca894b667d22252f9c60eaf901326d2447dc2302033b91bdb7a3de26e459a"

RPROVIDES:${PN} += "perl-WWW--Form--UrlEncoded \
perl-WWW--Form--UrlEncoded--PP \
perl-WWW-Form-UrlEncoded"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
