SUMMARY = "Dispatcher module for command line interface programs"
DESCRIPTION = "'App::CLI' dispatches CLI (command line interface) based commands into \
command classes. It also supports subcommand and per-command options."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.52"

RPM_NAME = "perl-App-CLI-0.52-1.12.noarch.rpm"
RPM_HASH = "5b086168f5075e63406aea3e169ee7d5a6ff161da9cb4f5c26bc5787fe19f07bb8b65d7a8e7d87eb1576edb5b4b1f6a2114f887d01593694a7282ba0c86a4835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--CLI \
perl-App--CLI--Command \
perl-App--CLI--Command--Commands \
perl-App--CLI--Command--Help \
perl-App--CLI--Command--Version \
perl-App--CLI--Helper \
perl-App-CLI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Capture--Tiny \
perl-Class--Load \
perl-Locale--Maketext--Simple \
perl-Pod--Simple--Text"

inherit rpm
