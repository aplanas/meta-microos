SUMMARY = "Disables bareword filehandles"
DESCRIPTION = "This module lexically disables the use of bareword filehandles with builtin \
functions, except for the special builtin filehandles 'STDIN', 'STDOUT', \
'STDERR', 'ARGV', 'ARGVOUT' and 'DATA'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-bareword-filehandles-0.007-1.21.aarch64.rpm"
RPM_HASH = "f7773ab93b00e85017bd1f226dab8d93a708bca99343a86d98c8f276f3b97d48b26439f98d45af7f4ef4d6e21f0fac748f62d901791477d2700b5d32b3646b40"

RPROVIDES:${PN} += "perl-bareword--filehandles \
perl-bareword-filehandles"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-B--Hooks--OP--Check"

inherit rpm
