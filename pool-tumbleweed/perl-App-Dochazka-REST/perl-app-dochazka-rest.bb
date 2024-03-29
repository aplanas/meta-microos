SUMMARY = "Dochazka REST server"
DESCRIPTION = "This distribution, App::Dochazka::REST, including all the modules in \
'lib/', the scripts in 'bin/', and the configuration files in 'config/', \
constitutes the REST server (API) component of Dochazka, the open-source \
Attendance/Time Tracking (ATT) system. \
 \
Dochazka as a whole aims to be a convenient, open-source ATT solution."
LICENSE = "BSD-3-Clause"

PV = "0.559"

RPM_NAME = "perl-App-Dochazka-REST-0.559-1.4.noarch.rpm"
RPM_HASH = "d3ba8ee680a218957c6934e402028dfb295aa6385256396d7b53d1ae34f20a5b8308bb31c804c71f90da7ea7f1434d88e89466c27a071df1905fb5295d0251cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-perl-App-Dochazka-REST \
perl-App--Dochazka--REST \
perl-App--Dochazka--REST--ACL \
perl-App--Dochazka--REST--Auth \
perl-App--Dochazka--REST--ConnBank \
perl-App--Dochazka--REST--Dispatch \
perl-App--Dochazka--REST--Docs--Resources \
perl-App--Dochazka--REST--Docs--Workflow \
perl-App--Dochazka--REST--Fillup \
perl-App--Dochazka--REST--Guide \
perl-App--Dochazka--REST--Holiday \
perl-App--Dochazka--REST--LDAP \
perl-App--Dochazka--REST--Mason \
perl-App--Dochazka--REST--Model--Activity \
perl-App--Dochazka--REST--Model--Component \
perl-App--Dochazka--REST--Model--Employee \
perl-App--Dochazka--REST--Model--Interval \
perl-App--Dochazka--REST--Model--Lock \
perl-App--Dochazka--REST--Model--Privhistory \
perl-App--Dochazka--REST--Model--Schedhistory \
perl-App--Dochazka--REST--Model--Schedintvls \
perl-App--Dochazka--REST--Model--Schedule \
perl-App--Dochazka--REST--Model--Shared \
perl-App--Dochazka--REST--Model--Tempintvl \
perl-App--Dochazka--REST--ResourceDefs \
perl-App--Dochazka--REST--Shared \
perl-App--Dochazka--REST--Test \
perl-App--Dochazka--REST--Util \
perl-App-Dochazka-REST"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
perl--MODULE-COMPAT-5.38.0 \
perl-App--CELL \
perl-App--Dochazka--Common \
perl-Authen--Passphrase--SaltedDigest \
perl-DBD--Pg \
perl-DBI \
perl-DBIx--Connector \
perl-Date--Calc \
perl-Date--Holidays--CZ \
perl-File--ShareDir \
perl-JSON \
perl-Mason \
perl-Params--Validate \
perl-Path--Router \
perl-Plack--Middleware--Session \
perl-Plack--Middleware--StackTrace \
perl-Plack--Runner \
perl-Pod--Simple--HTML \
perl-Starman \
perl-Test--Deep--NoTest \
perl-Try--Tiny \
perl-Web--MREST \
perl-Web--MREST--CLI \
perl-Web--Machine \
systemd"

inherit rpm
