SUMMARY = "XS based CSS minifier"
DESCRIPTION = "'CSS::Minifier::XS' is a CSS 'minifier'; its designed to remove unnecessary \
whitespace and comments from CSS files, while also *not* breaking the CSS. \
 \
'CSS::Minifier::XS' is similar in function to 'CSS::Minifier', but is \
substantially faster as its written in XS and not just pure Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.13"

RPM_NAME = "perl-CSS-Minifier-XS-0.13-1.10.aarch64.rpm"
RPM_HASH = "0da6f73c19ac83d937cc69e44043839996f51a9b6d55bfc536a79112076cdf6adde909f2deeae7bba730a2c1f6da532359aee0e382682a11c8a4b395d05a9f47"

RPROVIDES:${PN} += "perl(CSS::Minifier::XS) \
perl-CSS-Minifier-XS \
perl-CSS-Minifier-XS(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
