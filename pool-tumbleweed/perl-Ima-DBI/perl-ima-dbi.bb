SUMMARY = "Database connection caching and organization"
DESCRIPTION = "Ima::DBI attempts to organize and facilitate caching and more efficient use \
of database connections and statement handles by storing DBI and SQL \
information with your class (instead of as seperate objects). This allows \
you to pass around just one object without worrying about a trail of DBI \
handles behind it. \
 \
One of the things I always found annoying about writing large programs with \
DBI was making sure that I didn't have duplicate database handles open. I \
was also annoyed by the somewhat wasteful nature of the \
prepare/execute/finish route I'd tend to go through in my subroutines. The \
new DBI->connect_cached and DBI->prepare_cached helped a lot, but I still \
had to throw around global datasource, username and password information. \
 \
So, after a while I grew a small library of DBI helper routines and \
techniques. Ima::DBI is the culmination of all this, put into a nice(?), \
clean(?) class to be inherited from."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.35"

RPM_NAME = "perl-Ima-DBI-0.35-5.28.noarch.rpm"
RPM_HASH = "54eb196696d827b788237ae4856f985d82c65816efbcdb0f65722f2e79ebffeb786112147f52b4446d193544c25bd3e5b3101539d7277e8bdfd6669d9e6862da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Ima--DBI \
perl-Ima-DBI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Data--Inheritable \
perl-DBI \
perl-DBIx--ContextualFetch"

inherit rpm
