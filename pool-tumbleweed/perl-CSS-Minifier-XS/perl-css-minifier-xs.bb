SUMMARY = "XS based CSS minifier"
DESCRIPTION = "'CSS::Minifier::XS' is a CSS 'minifier'; its designed to remove unnecessary \
whitespace and comments from CSS files, while also *not* breaking the CSS. \
 \
'CSS::Minifier::XS' is similar in function to 'CSS::Minifier', but is \
substantially faster as its written in XS and not just pure Perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.13"

RPM_NAME = "perl-CSS-Minifier-XS-0.13-1.12.aarch64.rpm"
RPM_HASH = "2555f31ae760be7f36192c21563df350f47a759c6efa0af9e6daa0412a3c7329954ab10005a8140208b7f60ca7790cbe283ceb8f03962f893eff4ac707c6ebb0"

RPROVIDES:${PN} += "perl-CSS--Minifier--XS \
perl-CSS-Minifier-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
