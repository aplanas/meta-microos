SUMMARY = "Disables bareword filehandles"
DESCRIPTION = "This module lexically disables the use of bareword filehandles with builtin \
functions, except for the special builtin filehandles 'STDIN', 'STDOUT', \
'STDERR', 'ARGV', 'ARGVOUT' and 'DATA'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-bareword-filehandles-0.007-1.20.aarch64.rpm"
RPM_HASH = "241f719c000313704f74e7e88d43a1ebc8e53034cadb864fa002ecfa1d46aa1b1b27cd248041aca35c56aa4788b2713eab432b9188014c08bdc2fffb41502e65"

RPROVIDES:${PN} += "perl-bareword--filehandles \
perl-bareword-filehandles"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-B--Hooks--OP--Check"

inherit rpm
