SUMMARY = "Auto handling of Devel::NYTProf in your Mojolicious app"
DESCRIPTION = "This plugin enables Mojolicious to automatically generate Devel::NYTProf \
profiles and routes for your app, it has been inspired by \
Dancer::Plugin::NYTProf"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.23"

RPM_NAME = "perl-Mojolicious-Plugin-NYTProf-0.23-1.15.noarch.rpm"
RPM_HASH = "1396ccdc6e5d8ce1d0fddf3e1abe51be6bc643193752505e2b9a5193e443434cd2ff8f4f571b5e0dd1ae46b0eb74bbd674daa56317d3a63d185b96213c024d82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojolicious--Plugin--NYTProf \
perl-Mojolicious-Plugin-NYTProf"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Devel--NYTProf \
perl-File--Spec--Functions \
perl-File--Temp \
perl-File--Which \
perl-Mojolicious \
perl-Time--HiRes"

inherit rpm
