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

RPM_NAME = "perl-HTML-RewriteAttributes-0.05-8.22.noarch.rpm"
RPM_HASH = "4279705f88d3d6c2b04064c2dee62a06d4dc955bf233f70f852da63369b73ae1c57e6ce7dabd175b4b009a1fbde16620048a569f117f4d574aa5aa5f004fadaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--RewriteAttributes \
perl-HTML--RewriteAttributes--Links \
perl-HTML--RewriteAttributes--Resources \
perl-HTML-RewriteAttributes"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTML--Entities \
perl-HTML--Parser \
perl-HTML--Tagset \
perl-URI"

inherit rpm
