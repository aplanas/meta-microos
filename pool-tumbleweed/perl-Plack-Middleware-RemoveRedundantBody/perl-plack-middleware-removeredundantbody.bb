SUMMARY = "Plack::Middleware which removes body for HTTP response if it's not required"
DESCRIPTION = "This module removes body in HTTP response, if it's not required."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Plack-Middleware-RemoveRedundantBody-0.09-1.13.noarch.rpm"
RPM_HASH = "d30f4e5f6d327d77c9ffe24f8fd6a0831b73a06ff4f2268a135d73f0014c51948fa97511de8d81deb62daedad071429834793376437179ddf4dad592db29a0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Middleware--RemoveRedundantBody \
perl-Plack-Middleware-RemoveRedundantBody"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Plack--Middleware \
perl-Plack--Util \
perl-parent"

inherit rpm
