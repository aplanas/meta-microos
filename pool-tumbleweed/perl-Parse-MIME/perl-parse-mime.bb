SUMMARY = "Parse mime-types, match against media ranges"
DESCRIPTION = "This module provides basic functions for handling mime-types. It can handle \
matching mime-types against a list of media-ranges. See section 14.1 of the \
HTTP specification [RFC 2616] for a complete explanation: \
http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.1"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.006"

RPM_NAME = "perl-Parse-MIME-1.006-1.3.noarch.rpm"
RPM_HASH = "47524a59270cd159fd4dcdd2972380872122493e42f6f66c5ff30a2fd8fa89e2e03d21146b932d2a6b6eb02e7edac9b2a4b5f8ffb38d7955d45f5cebaf468d57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--MIME \
perl-Parse-MIME"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
