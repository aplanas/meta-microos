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

RPM_NAME = "perl-Proc-Fork-0.808-1.2.noarch.rpm"
RPM_HASH = "3a5e904edc370f48db8381c972cef30c787d1a603d50359cefc6c7201aa7844970e001c3538d0c9c9b4f2651148d7949de5994115c509105a1a6c8033c418944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Proc::Fork) \
perl-Proc-Fork"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Exporter::Tidy)"

inherit rpm
