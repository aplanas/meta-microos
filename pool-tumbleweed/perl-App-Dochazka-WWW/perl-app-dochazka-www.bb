SUMMARY = "Dochazka Attendance & Time Tracking system web client"
DESCRIPTION = "This is the web client of the Dochazka Attendance & Time Tracking system. \
For more information see the App::Dochazka::REST manpage and the \
App::MFILE::WWW manpage."
LICENSE = "BSD-3-Clause"

PV = "0.155"

RPM_NAME = "perl-App-Dochazka-WWW-0.155-2.18.noarch.rpm"
RPM_HASH = "346080d502f12d402711d84c8e07f9a63995162f841ee20087401b502d17bd8ef7601e6994eef1c0746306d9f396ca36da2ceb885c5da121f8d8dd9ff6cddbe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-perl-App-Dochazka-WWW \
perl-App--Dochazka--WWW \
perl-App--Dochazka--WWW--Dispatch \
perl-App-Dochazka-WWW"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
perl--MODULE-COMPAT-5.36.1 \
perl-App--CELL \
perl-App--MFILE--WWW \
perl-File--ShareDir"

inherit rpm
