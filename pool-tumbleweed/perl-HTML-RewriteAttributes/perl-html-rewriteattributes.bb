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

RPM_NAME = "perl-HTML-RewriteAttributes-0.05-8.21.noarch.rpm"
RPM_HASH = "6e2f472353513491edf5ffe7068cec269bb463fdc5ac852295b260111a7f9054333e07cb59b90caa4b94e16f915989bde5a71073ec9c5e72124c8e5f56742df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--RewriteAttributes \
perl-HTML--RewriteAttributes--Links \
perl-HTML--RewriteAttributes--Resources \
perl-HTML-RewriteAttributes"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTML--Entities \
perl-HTML--Parser \
perl-HTML--Tagset \
perl-URI"

inherit rpm
