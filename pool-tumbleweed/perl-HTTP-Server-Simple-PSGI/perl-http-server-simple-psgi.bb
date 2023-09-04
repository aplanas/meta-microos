SUMMARY = "PSGI handler for HTTP::Server::Simple"
DESCRIPTION = "HTTP::Server::Simple::PSGI is a HTTP::Server::Simple based HTTP server that \
can run PSGI applications. This module only depends on \
HTTP::Server::Simple, which itself doesn't depend on any non-core modules \
so it's best to be used as an embedded web server."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-HTTP-Server-Simple-PSGI-0.16-1.12.noarch.rpm"
RPM_HASH = "c9eab24c5d19f32103ce296241665e98f4abc7b24bd702d7b8084e7413bdd2be3f7ac766e6dd18ca000dd689979e9725ae08fb7348d56da6fecd8f1bcf2e89df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Server--Simple--PSGI \
perl-HTTP--Server--Simple--PSGI--Writer \
perl-HTTP-Server-Simple-PSGI \
perl-Plack--Handler--HTTP--Server--Simple \
perl-Plack--Handler--HTTP--Server--Simple--PSGIServer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--Server--Simple"

inherit rpm
