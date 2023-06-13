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

RPM_NAME = "perl-JavaScript-Minifier-XS-0.15-1.9.aarch64.rpm"
RPM_HASH = "b8d3950fbf39606772d7e667f1f1a63e128b7661feea5b2f11458e85a02d1afa86f21d32f42fdae8b6ff2b9e3430b06af9e7e96eb770cb1b2dbf37327cff50c1"

RPROVIDES:${PN} += "perl(JavaScript::Minifier::XS) \
perl-JavaScript-Minifier-XS \
perl-JavaScript-Minifier-XS(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
