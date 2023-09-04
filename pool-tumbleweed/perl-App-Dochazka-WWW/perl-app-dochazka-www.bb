SUMMARY = "Dochazka Attendance & Time Tracking system web client"
DESCRIPTION = "This is the web client of the Dochazka Attendance & Time Tracking system. \
For more information see the App::Dochazka::REST manpage and the \
App::MFILE::WWW manpage."
LICENSE = "BSD-3-Clause"

PV = "0.155"

RPM_NAME = "perl-App-Dochazka-WWW-0.155-2.19.noarch.rpm"
RPM_HASH = "edd99bc02b7e954b99227bb49e080b3732f3abb2fe8faab94927692a2c1f8f071b529b8185eea2146b59ca18b8249802446a91454f9ec492257fab38f2255105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-perl-App-Dochazka-WWW \
perl-App--Dochazka--WWW \
perl-App--Dochazka--WWW--Dispatch \
perl-App-Dochazka-WWW"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
perl--MODULE-COMPAT-5.38.0 \
perl-App--CELL \
perl-App--MFILE--WWW \
perl-File--ShareDir"

inherit rpm
