SUMMARY = "Concise Attribute Rewriting"
DESCRIPTION = "'HTML::RewriteAttributes' is designed for simple yet powerful HTML \
attribute rewriting. \
 \
You simply specify a callback to run for each attribute and we do the rest \
for you. \
 \
This module is designed to be subclassable to make handling special cases \
eaiser. See the source for methods you can override."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-HTML-RewriteAttributes-0.05-8.20.noarch.rpm"
RPM_HASH = "0bb7b6c858c13127df0f2bfc2a174ac09291c924ebdd7f77e7156947c4e59bd991f13936ac63773cffaeaf335879a0e4a60b02f3fa3c30c7c72954cc64284d35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--RewriteAttributes \
perl-HTML--RewriteAttributes--Links \
perl-HTML--RewriteAttributes--Resources \
perl-HTML-RewriteAttributes"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-HTML--Entities \
perl-HTML--Parser \
perl-HTML--Tagset \
perl-URI"

inherit rpm
