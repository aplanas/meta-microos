SUMMARY = "Object for handling URI templates (RFC 6570)"
DESCRIPTION = "This module provides a wrapper around URI templates as described in RFC \
6570: http://tools.ietf.org/html/rfc6570."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.24"

RPM_NAME = "perl-URI-Template-0.24-1.17.noarch.rpm"
RPM_HASH = "5ea00ad592fbe9efb11319336c7cbdf66157e28a3229fca55c94ebe9792803b7832f55dd5b8399c5833f0bb6d706f46bcd5f9e9d30cd7d2487af49bee06b5f0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--Template \
perl-URI-Template"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-URI \
perl-URI--Escape"

inherit rpm
