SUMMARY = "XS based JavaScript minifier"
DESCRIPTION = "'JavaScript::Minifier::XS' is a JavaScript 'minifier'; its designed to \
remove unnecessary whitespace and comments from JavaScript files, which \
also *not* breaking the JavaScript. \
 \
'JavaScript::Minifier::XS' is similar in function to \
'JavaScript::Minifier', but is substantially faster as its written in XS \
and not just pure Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-JavaScript-Minifier-XS-0.15-1.11.aarch64.rpm"
RPM_HASH = "e8f35381e2259c8c578f1525a2f9c3038fba2e214d810431cdd8b2319c34759707f6963a2776ef4f0c0f20df24bcefea73a6526ddfe00812ca64f18bc5cf456a"

RPROVIDES:${PN} += "perl-JavaScript--Minifier--XS \
perl-JavaScript-Minifier-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
