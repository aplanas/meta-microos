SUMMARY = "Parse mime-types, match against media ranges"
DESCRIPTION = "This module provides basic functions for handling mime-types. It can handle \
matching mime-types against a list of media-ranges. See section 14.1 of the \
HTTP specification [RFC 2616] for a complete explanation: \
http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.1"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.006"

RPM_NAME = "perl-Parse-MIME-1.006-1.4.noarch.rpm"
RPM_HASH = "125e63fea69812db80f02fc89d1e7acd89a978d7c11cec02e0cb337cd1f4cd161716ff65505fc76f2b1c9bfba84ec7e16e7e7671407bb49be8dedaeed524fe78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--MIME \
perl-Parse-MIME"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
