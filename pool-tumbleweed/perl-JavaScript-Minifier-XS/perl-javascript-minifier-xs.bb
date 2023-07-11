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

RPM_NAME = "perl-JavaScript-Minifier-XS-0.15-1.10.aarch64.rpm"
RPM_HASH = "4cc6a26c2d387bbd2689195944e0ffd7f0e889c7858cf0e6c0edada63a70bc08ff44f58a8a77c57372f7b1b8bba2d40e1ed41c3d836e9eb1e5bcfbdba7ce5a26"

RPROVIDES:${PN} += "perl-JavaScript--Minifier--XS \
perl-JavaScript-Minifier-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
