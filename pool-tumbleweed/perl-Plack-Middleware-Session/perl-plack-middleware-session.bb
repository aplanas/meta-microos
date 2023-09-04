SUMMARY = "Middleware for session management"
DESCRIPTION = "This is a Plack Middleware component for session management. By default it \
will use cookies to keep session state and store data in memory. This \
distribution also comes with other state and store solutions. See perldoc \
for these backends how to use them. \
 \
It should be noted that we store the current session as a hash reference in \
the 'psgix.session' key inside the '$env' where you can access it as \
needed. \
 \
*NOTE:* As of version 0.04 the session is stored in 'psgix.session' instead \
of 'plack.session'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.33"

RPM_NAME = "perl-Plack-Middleware-Session-0.33-1.17.noarch.rpm"
RPM_HASH = "e2dfb39c43697d626eb1d117ffe7ae8f6e68b62bdc08ba3f20396971c2b52a2e218c066fc02a8c19a94f24306c6268b293cb1e28e205f08324ce539a5dbbe244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Middleware--Session \
perl-Plack--Middleware--Session--Cookie \
perl-Plack--Session \
perl-Plack--Session--Cleanup \
perl-Plack--Session--State \
perl-Plack--Session--State--Cookie \
perl-Plack--Session--Store \
perl-Plack--Session--Store--Cache \
perl-Plack--Session--Store--DBI \
perl-Plack--Session--Store--File \
perl-Plack--Session--Store--Null \
perl-Plack-Middleware-Session"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Cookie--Baker \
perl-Digest--HMAC-SHA1 \
perl-Digest--SHA \
perl-Plack"

inherit rpm
