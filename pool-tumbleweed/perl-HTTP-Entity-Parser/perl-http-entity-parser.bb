SUMMARY = "PSGI compliant HTTP Entity Parser"
DESCRIPTION = "HTTP::Entity::Parser is a PSGI-compliant HTTP Entity parser. This module \
also is compatible with HTTP::Body. Unlike HTTP::Body, HTTP::Entity::Parser \
reads HTTP entities from PSGI's environment '$env->{'psgi.input'}' and \
parses it. This module supports application/x-www-form-urlencoded, \
multipart/form-data and application/json."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.25"

RPM_NAME = "perl-HTTP-Entity-Parser-0.25-1.12.noarch.rpm"
RPM_HASH = "b68774ba18a2225bb8f0818e0b20ae2131eaad1e647aa43dc05f09f3d12d8f410522d5b45743851fb72b71cb66939077251f5752ee724faa9c61d6997285c836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--Entity--Parser \
perl-HTTP--Entity--Parser--JSON \
perl-HTTP--Entity--Parser--MultiPart \
perl-HTTP--Entity--Parser--OctetStream \
perl-HTTP--Entity--Parser--UrlEncoded \
perl-HTTP-Entity-Parser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTTP--MultiPartParser \
perl-Hash--MultiValue \
perl-JSON--MaybeXS \
perl-Module--Load \
perl-Stream--Buffered \
perl-WWW--Form--UrlEncoded"

inherit rpm
