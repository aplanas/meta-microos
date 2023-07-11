SUMMARY = "Dochazka command line client"
DESCRIPTION = "App::Dochazka::CLI is the Command Line Interface (CLI) component of the \
Dochazka Attendance & Time Tracking system. \
 \
In order to work, the CLI must be pointed at a running App::Dochazka::REST \
(i.e., Dochazka REST server) instance by setting the 'MREST_CLI_URI_BASE' \
meta configuration parameter. \
 \
Detailed documentation covering configuration, deployment, and the commands \
that can be used with the CLI can be found in App::Dochazka::CLI::Guide. \
 \
This module is used to store some 'global' package variables that are used \
throughout the CLI code base."
LICENSE = "BSD-3-Clause"

PV = "0.238"

RPM_NAME = "perl-App-Dochazka-CLI-0.238-1.30.noarch.rpm"
RPM_HASH = "2f453958a67040ab12cb21e81353e7a708190f2b4900b70d7dd754a1e1fd9fd73a598ae8494d63283f89576083f0b4b3d0fc66e9000259b85dc5a2f49db984f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-perl-App-Dochazka-CLI \
perl-App--Dochazka--CLI \
perl-App--Dochazka--CLI--CommandMap \
perl-App--Dochazka--CLI--Commands--Activity \
perl-App--Dochazka--CLI--Commands--Component \
perl-App--Dochazka--CLI--Commands--Employee \
perl-App--Dochazka--CLI--Commands--History \
perl-App--Dochazka--CLI--Commands--Interval \
perl-App--Dochazka--CLI--Commands--Misc \
perl-App--Dochazka--CLI--Commands--Priv \
perl-App--Dochazka--CLI--Commands--Schedule \
perl-App--Dochazka--CLI--Completion \
perl-App--Dochazka--CLI--Guide \
perl-App--Dochazka--CLI--Parser \
perl-App--Dochazka--CLI--Shared \
perl-App--Dochazka--CLI--Test \
perl-App--Dochazka--CLI--Testers \
perl-App--Dochazka--CLI--TokenMap \
perl-App--Dochazka--CLI--Util \
perl-App-Dochazka-CLI"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-App--CELL \
perl-App--Dochazka--Common \
perl-Date--Calc \
perl-File--HomeDir \
perl-File--ShareDir \
perl-File--Slurp \
perl-HTTP--Cookies \
perl-HTTP--Request \
perl-JSON \
perl-LWP--UserAgent \
perl-Params--Validate \
perl-Term--ReadKey \
perl-Term--ReadLine--Gnu \
perl-Text--Table \
perl-Web--MREST--CLI \
xdg-utils"

inherit rpm
