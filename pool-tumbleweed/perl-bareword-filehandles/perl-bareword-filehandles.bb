SUMMARY = "Disables bareword filehandles"
DESCRIPTION = "This module lexically disables the use of bareword filehandles with builtin \
functions, except for the special builtin filehandles 'STDIN', 'STDOUT', \
'STDERR', 'ARGV', 'ARGVOUT' and 'DATA'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-bareword-filehandles-0.007-1.19.aarch64.rpm"
RPM_HASH = "c225279b2bd98157caa59a22d0d2995236c1cc80eb8048ccbdd697b0731a854dcf3b707d2c2de6afedcc218757ac07620e1283de6d874163ea0c449f5179fbca"

RPROVIDES:${PN} += "perl-bareword--filehandles \
perl-bareword-filehandles"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-B--Hooks--OP--Check"

inherit rpm
