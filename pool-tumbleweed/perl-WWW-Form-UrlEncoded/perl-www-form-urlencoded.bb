SUMMARY = "Parser and builder for application/x-www-form-urlencoded"
DESCRIPTION = "WWW::Form::UrlEncoded provides application/x-www-form-urlencoded parser and \
builder. This module aims to have compatibility with other CPAN modules \
like HTTP::Body's urlencoded parser. \
 \
This module try to use WWW::Form::UrlEncoded::XS by default and fail to it, \
use WWW::Form::UrlEncoded::PP instead"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.26"

RPM_NAME = "perl-WWW-Form-UrlEncoded-0.26-1.13.aarch64.rpm"
RPM_HASH = "54467d6bb547a79e42d7bed494ce02f10ecdc72077a2262b09da2f3ef668758ef26fb311282a8db07132bdd1879f6d81871988fe458eb68505264d02ce33b9c7"

RPROVIDES:${PN} += "perl-WWW--Form--UrlEncoded \
perl-WWW--Form--UrlEncoded--PP \
perl-WWW-Form-UrlEncoded"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
