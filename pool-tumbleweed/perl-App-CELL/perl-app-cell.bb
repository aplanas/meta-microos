SUMMARY = "Configuration, Error-handling, Localization, and Logging"
DESCRIPTION = "This is the top-level module of App::CELL, the Configuration, \
Error-handling, Localization, and Logging framework for applications (or \
scripts) written in Perl. \
 \
For details, read the POD in the App::CELL distro. For an introduction, \
read App::CELL::Guide."
LICENSE = "BSD-3-Clause"

PV = "0.231"

RPM_NAME = "perl-App-CELL-0.231-1.5.noarch.rpm"
RPM_HASH = "c3735c07982fedf375756c1e46c5874f455013d5b15792d9698ebc133105736a5ff3ddbc5bd977eb613db31bb326aed0f252eac532cb07c82340a9aa7ec8019b"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Date--Format \
perl-File--HomeDir \
perl-File--Next \
perl-File--ShareDir \
perl-Log--Any \
perl-Log--Any--Adapter \
perl-Params--Validate \
perl-Try--Tiny"

inherit rpm
