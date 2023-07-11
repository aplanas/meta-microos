SUMMARY = "GNU C library compatible strftime for loggers and servers"
DESCRIPTION = "POSIX::strftime::Compiler provides GNU C library compatible strftime(3). \
But this module will not affected by the system locale. This feature is \
useful when you want to write loggers, servers and portable applications. \
 \
For generate same result strings on any locale, POSIX::strftime::Compiler \
wraps POSIX::strftime and converts some format characters to perl code"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.44"

RPM_NAME = "perl-POSIX-strftime-Compiler-0.44-1.14.noarch.rpm"
RPM_HASH = "349ea71afcc7b61ffde1598ae24844cd7ed57a1cd5508c39a8ac74f6b5de2c60e7e317f223a715fd7bdd5f2caa226425cf26e8a1c2628cdfeca4eb8222a4eb1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-POSIX--strftime--Compiler \
perl-POSIX-strftime-Compiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
