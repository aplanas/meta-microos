SUMMARY = "App::Rad plugin for providing extra help info"
DESCRIPTION = "This is an App::Rad manpage plugin for providing extra help info. It \
provides a 'more_help' method which can be used to provide extra info that \
will be appended to to bottom of the help message."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0001"

RPM_NAME = "perl-App-Rad-Plugin-MoreHelp-0.0001-2.24.noarch.rpm"
RPM_HASH = "851e4225fa4023ee91171c441a4eb1a896e722a04a1ea389c4c71e1054f8856b697bfc894df4027232952d6080f89a4d475cea1767789e85eabedf024c57b55e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Rad--Plugin--MoreHelp \
perl-App-Rad-Plugin-MoreHelp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-App--Rad"

inherit rpm
