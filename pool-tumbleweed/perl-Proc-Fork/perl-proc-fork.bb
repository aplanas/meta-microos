SUMMARY = "Simple, intuitive interface to the fork() system call"
DESCRIPTION = "This module provides an intuitive, Perl-ish way to write forking programs \
by letting you use blocks to illustrate which code section executes in \
which fork. The code for the parent, child, retry handler and error handler \
are grouped together in a 'fork block'. The clauses may appear in any \
order, but they must be consecutive (without any other statements in \
between). \
 \
All four clauses need not be specified. If the retry clause is omitted, \
only one fork will be attempted. If the error clause is omitted the program \
will die with a simple message if it can't retry. If the parent or child \
clause is omitted, the respective (parent or child) process will start \
execution after the final clause. So if one or the other only has to do \
some simple action, you need only specify that one. For example: \
 \
  \
 run_fork { child { \
     exec '/bin/ls', '-l'; \
     die 'Couldn't exec ls: $!\\n'; \
 } }; \
  \
  \
 \
If the code in any of the clauses does not die or exit, it will continue \
execution after the fork block."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.808"

RPM_NAME = "perl-Proc-Fork-0.808-1.4.noarch.rpm"
RPM_HASH = "c931ca2024433573bc7f5141ae77d8cb405b73a2ef5c308cbf304653e5e3f05788cccd3f28f4597a21dda9d087594d7b5aac361fdccd5463258068836758a856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Proc--Fork \
perl-Proc-Fork"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Exporter--Tidy"

inherit rpm
