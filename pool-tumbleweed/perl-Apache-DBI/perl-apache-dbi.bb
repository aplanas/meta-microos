SUMMARY = "Initiate a persistent database connection"
DESCRIPTION = "This module initiates a persistent database connection. \
 \
The database access uses Perl's DBI. For supported DBI drivers see: \
 \
 http://dbi.perl.org/ \
 \
When loading the DBI module (do not confuse this with the Apache::DBI \
module) it checks if the environment variable 'MOD_PERL' has been set and \
if the module Apache::DBI has been loaded. In this case every connect \
request will be forwarded to the Apache::DBI module. This checks if a \
database handle from a previous connect request is already stored and if \
this handle is still valid using the ping method. If these two conditions \
are fulfilled it just returns the database handle. The parameters defining \
the connection have to be exactly the same, including the connect \
attributes! If there is no appropriate database handle or if the ping \
method fails, a new connection is established and the handle is stored for \
later re-use. There is no need to remove the disconnect statements from \
your code. They won't do anything because the Apache::DBI module overloads \
the disconnect method."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.12"

RPM_NAME = "perl-Apache-DBI-1.12-1.28.noarch.rpm"
RPM_HASH = "551549e38d769b299b27cada4a9df6afe7a054c2806b319d56cef1ad96678320f73c400f7398e1ace16cff1da320303741ebaace877d339203464864336ae6f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Apache--AuthDBI \
perl-Apache--DBI \
perl-Apache--DBI--db \
perl-Apache-DBI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DBI \
perl-Digest--SHA1"

inherit rpm
