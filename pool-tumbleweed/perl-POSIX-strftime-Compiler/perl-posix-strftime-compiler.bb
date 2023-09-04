SUMMARY = "GNU C library compatible strftime for loggers and servers"
DESCRIPTION = "POSIX::strftime::Compiler provides GNU C library compatible strftime(3). \
But this module will not affected by the system locale. This feature is \
useful when you want to write loggers, servers and portable applications. \
 \
For generate same result strings on any locale, POSIX::strftime::Compiler \
wraps POSIX::strftime and converts some format characters to perl code"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.44"

RPM_NAME = "perl-POSIX-strftime-Compiler-0.44-1.15.noarch.rpm"
RPM_HASH = "fe7fe85922ac55ed29020f26376a1c26e96dd5cf64859b927fe173a6457cdb4c6afe90d50cc154e1d2cc727f92e17dca60dfba33f1810539d108380746b3de8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-POSIX--strftime--Compiler \
perl-POSIX-strftime-Compiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
