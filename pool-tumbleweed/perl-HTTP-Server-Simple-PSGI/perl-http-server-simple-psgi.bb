SUMMARY = "PSGI handler for HTTP::Server::Simple"
DESCRIPTION = "HTTP::Server::Simple::PSGI is a HTTP::Server::Simple based HTTP server that \
can run PSGI applications. This module only depends on \
HTTP::Server::Simple, which itself doesn't depend on any non-core modules \
so it's best to be used as an embedded web server."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-HTTP-Server-Simple-PSGI-0.16-1.11.noarch.rpm"
RPM_HASH = "32a9c5609728d2cf3634314a59339f8ebeddb86f1f5044c20659cb6c75e6e3a326273e6e6386034b1ae538a88f184b253e3f4b9c5a28f89c84a34da220fbc672"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Server--Simple--PSGI \
perl-HTTP--Server--Simple--PSGI--Writer \
perl-HTTP-Server-Simple-PSGI \
perl-Plack--Handler--HTTP--Server--Simple \
perl-Plack--Handler--HTTP--Server--Simple--PSGIServer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTTP--Server--Simple"

inherit rpm
