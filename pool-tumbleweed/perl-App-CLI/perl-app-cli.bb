SUMMARY = "Dispatcher module for command line interface programs"
DESCRIPTION = "'App::CLI' dispatches CLI (command line interface) based commands into \
command classes. It also supports subcommand and per-command options."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.52"

RPM_NAME = "perl-App-CLI-0.52-1.13.noarch.rpm"
RPM_HASH = "a73cb90b90a942f18e6c2673c46913b191bae2a3b8583b9514239f769b1a33d55351e53843051eeb7f1c432ba2123f82ddfcda90aa91c230e3531bfd36a7c23d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--CLI \
perl-App--CLI--Command \
perl-App--CLI--Command--Commands \
perl-App--CLI--Command--Help \
perl-App--CLI--Command--Version \
perl-App--CLI--Helper \
perl-App-CLI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Capture--Tiny \
perl-Class--Load \
perl-Locale--Maketext--Simple \
perl-Pod--Simple--Text"

inherit rpm
