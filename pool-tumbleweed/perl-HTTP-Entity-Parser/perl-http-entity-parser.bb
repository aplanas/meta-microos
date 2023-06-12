SUMMARY = "PSGI compliant HTTP Entity Parser"
DESCRIPTION = "HTTP::Entity::Parser is a PSGI-compliant HTTP Entity parser. This module \
also is compatible with HTTP::Body. Unlike HTTP::Body, HTTP::Entity::Parser \
reads HTTP entities from PSGI's environment '$env->{'psgi.input'}' and \
parses it. This module supports application/x-www-form-urlencoded, \
multipart/form-data and application/json."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.25"

RPM_NAME = "perl-HTTP-Entity-Parser-0.25-1.11.noarch.rpm"
RPM_HASH = "d002195e55fddbf8afc4fc8b31e2659e80e670b007dd0f5b0688409e24bfbc8eba35df5ae4becc222cf4e62329d033aaddf46ed9de3d5f042a3321bec0b2dfbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTTP::Entity::Parser) \
perl(HTTP::Entity::Parser::JSON) \
perl(HTTP::Entity::Parser::MultiPart) \
perl(HTTP::Entity::Parser::OctetStream) \
perl(HTTP::Entity::Parser::UrlEncoded) \
perl-HTTP-Entity-Parser"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(HTTP::MultiPartParser) \
perl(Hash::MultiValue) \
perl(JSON::MaybeXS) \
perl(Module::Load) \
perl(Stream::Buffered) \
perl(WWW::Form::UrlEncoded)"

inherit rpm
