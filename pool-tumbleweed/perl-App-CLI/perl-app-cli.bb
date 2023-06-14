SUMMARY = "Dispatcher module for command line interface programs"
DESCRIPTION = "'App::CLI' dispatches CLI (command line interface) based commands into \
command classes. It also supports subcommand and per-command options."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.52"

RPM_NAME = "perl-App-CLI-0.52-1.11.noarch.rpm"
RPM_HASH = "86802366bc2e318d1479d86fbf9273dda3de3be4d603289e59879ac165a197004c8f7a24271571d6c7be7a3cdeda96d44a4c84f637edec40c18a332ebc32efc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--CLI \
perl-App--CLI--Command \
perl-App--CLI--Command--Commands \
perl-App--CLI--Command--Help \
perl-App--CLI--Command--Version \
perl-App--CLI--Helper \
perl-App-CLI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Capture--Tiny \
perl-Class--Load \
perl-Locale--Maketext--Simple \
perl-Pod--Simple--Text"

inherit rpm
