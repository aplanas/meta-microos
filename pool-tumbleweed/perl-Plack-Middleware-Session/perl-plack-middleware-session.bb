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

RPM_NAME = "perl-Plack-Middleware-Session-0.33-1.16.noarch.rpm"
RPM_HASH = "83796b67c01e95ba2196c0241c2bb0eeeeea65b062632e07986e8de1bad37feb73a108c472234555042151592a14261b03ed63adae16ce2fda4daa4f288b26f0"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Cookie--Baker \
perl-Digest--HMAC-SHA1 \
perl-Digest--SHA \
perl-Plack"

inherit rpm
