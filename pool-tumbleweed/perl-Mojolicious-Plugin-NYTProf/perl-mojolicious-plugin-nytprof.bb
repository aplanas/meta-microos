SUMMARY = "Auto handling of Devel::NYTProf in your Mojolicious app"
DESCRIPTION = "This plugin enables Mojolicious to automatically generate Devel::NYTProf \
profiles and routes for your app, it has been inspired by \
Dancer::Plugin::NYTProf"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.23"

RPM_NAME = "perl-Mojolicious-Plugin-NYTProf-0.23-1.14.noarch.rpm"
RPM_HASH = "7ecb7c335995beec9f3b02149421301be46ace216607d5859fb680ebf5bcf70b07720c7b66a4795af6441bdc689bfc68d03f8283b04da2cc771723a0875250a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojolicious--Plugin--NYTProf \
perl-Mojolicious-Plugin-NYTProf"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Devel--NYTProf \
perl-File--Spec--Functions \
perl-File--Temp \
perl-File--Which \
perl-Mojolicious \
perl-Time--HiRes"

inherit rpm
