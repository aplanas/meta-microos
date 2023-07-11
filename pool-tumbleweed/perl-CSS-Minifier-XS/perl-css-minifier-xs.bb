SUMMARY = "XS based CSS minifier"
DESCRIPTION = "'CSS::Minifier::XS' is a CSS 'minifier'; its designed to remove unnecessary \
whitespace and comments from CSS files, while also *not* breaking the CSS. \
 \
'CSS::Minifier::XS' is similar in function to 'CSS::Minifier', but is \
substantially faster as its written in XS and not just pure Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.13"

RPM_NAME = "perl-CSS-Minifier-XS-0.13-1.11.aarch64.rpm"
RPM_HASH = "d785e985e204d55b387157e411c01eea679daafd577ac2e3878dedfdb47f20580afbd5d77b58a52c177e5b7b583a63a1bcf2ed19501a9aecb2f2406c8a41a99f"

RPROVIDES:${PN} += "perl-CSS--Minifier--XS \
perl-CSS-Minifier-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
