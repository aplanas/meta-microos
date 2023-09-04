SUMMARY = "PSGI compliant HTTP Entity Parser"
DESCRIPTION = "HTTP::Entity::Parser is a PSGI-compliant HTTP Entity parser. This module \
also is compatible with HTTP::Body. Unlike HTTP::Body, HTTP::Entity::Parser \
reads HTTP entities from PSGI's environment '$env->{'psgi.input'}' and \
parses it. This module supports application/x-www-form-urlencoded, \
multipart/form-data and application/json."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.25"

RPM_NAME = "perl-HTTP-Entity-Parser-0.25-1.13.noarch.rpm"
RPM_HASH = "9244567a1eb36888ca6b171cbe288187d7aec2a57bf74e3a9e35e20454c62042014f87ef6cb24fffafb200b2dbda396182b044704e4c56aca412eccbc922d9ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Entity--Parser \
perl-HTTP--Entity--Parser--JSON \
perl-HTTP--Entity--Parser--MultiPart \
perl-HTTP--Entity--Parser--OctetStream \
perl-HTTP--Entity--Parser--UrlEncoded \
perl-HTTP-Entity-Parser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--MultiPartParser \
perl-Hash--MultiValue \
perl-JSON--MaybeXS \
perl-Module--Load \
perl-Stream--Buffered \
perl-WWW--Form--UrlEncoded"

inherit rpm
