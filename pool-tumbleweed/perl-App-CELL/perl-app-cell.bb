SUMMARY = "Configuration, Error-handling, Localization, and Logging"
DESCRIPTION = "This is the top-level module of App::CELL, the Configuration, \
Error-handling, Localization, and Logging framework for applications (or \
scripts) written in Perl. \
 \
For details, read the POD in the App::CELL distro. For an introduction, \
read App::CELL::Guide."
LICENSE = "BSD-3-Clause"

PV = "0.231"

RPM_NAME = "perl-App-CELL-0.231-1.6.noarch.rpm"
RPM_HASH = "71bddfb754dcc466071562756a15161d7e2b80eb91388d77e3c4760129162fb459c5d38dc15a41a7642858826fbd9c9df33450ca6a55f296cc1089987a1c152c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--CELL \
perl-App--CELL--Config \
perl-App--CELL--Guide \
perl-App--CELL--Load \
perl-App--CELL--Log \
perl-App--CELL--Message \
perl-App--CELL--Status \
perl-App--CELL--Test \
perl-App--CELL--Test--LogToFile \
perl-App--CELL--Util \
perl-App-CELL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Date--Format \
perl-File--HomeDir \
perl-File--Next \
perl-File--ShareDir \
perl-Log--Any \
perl-Log--Any--Adapter \
perl-Params--Validate \
perl-Try--Tiny"

inherit rpm
