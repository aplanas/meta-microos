SUMMARY = "Plack::Middleware which removes body for HTTP response if it's not required"
DESCRIPTION = "This module removes body in HTTP response, if it's not required."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Plack-Middleware-RemoveRedundantBody-0.09-1.14.noarch.rpm"
RPM_HASH = "1af8224e8cd1a55dcf3701f6dde74470f558bf9feb9938ae8d93e329fcb2e5b7278bf3bb33e3327c2447617fdd168989315f62c7442e562e10b4146dac3a7e25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Middleware--RemoveRedundantBody \
perl-Plack-Middleware-RemoveRedundantBody"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Plack--Middleware \
perl-Plack--Util \
perl-parent"

inherit rpm
