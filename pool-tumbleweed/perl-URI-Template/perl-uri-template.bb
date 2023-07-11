SUMMARY = "Object for handling URI templates (RFC 6570)"
DESCRIPTION = "This module provides a wrapper around URI templates as described in RFC \
6570: http://tools.ietf.org/html/rfc6570."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.24"

RPM_NAME = "perl-URI-Template-0.24-1.16.noarch.rpm"
RPM_HASH = "74c9712b2a6641978556765a4ad24e0adcd1425564930681a04e303a4a48cccd3462892a9448a152a2750d1f5d30879546cc9fe8754e578069eea91688d79dc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--Template \
perl-URI-Template"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-URI \
perl-URI--Escape"

inherit rpm
