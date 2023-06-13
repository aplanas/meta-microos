SUMMARY = "Advanced MySQL and system command-line tools"
DESCRIPTION = "Percona Toolkit is a collection of advanced command-line tools used by \
Percona (http://www.percona.com/) support staff to perform a variety of \
MySQL and system tasks that are too difficult or complex to perform manually. \
 \
These tools are ideal alternatives to private or 'one-off' scripts because \
they are professionally developed, formally tested, and fully documented. \
They are also fully self-contained, so installation is quick and easy and \
no libraries are installed. \
 \
Percona Toolkit is developed and supported by Percona Inc.  For more \
information and other free, open-source software developed by Percona, \
visit http://www.percona.com/software/. \
 \
This collection was formerly known as Maatkit."
LICENSE = "GPL-2.0-only"

PV = "3.3.1"

RPM_NAME = "percona-toolkit-3.3.1-2.12.aarch64.rpm"
RPM_HASH = "ea0a507e74555aba79615560be399ed9e32b18fb738308bb58976bac5df07b409077adc81054dc6e8bebb1ac92f5f04ccb923f9889d014a69af8d45781267163"

RPROVIDES:${PN} += "config(percona-toolkit) \
maatkit \
percona-toolkit \
percona-toolkit(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/perl \
libc.so.6(GLIBC_2.34)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(DBD::mysql) \
perl(DBI) \
perl(IO::Socket::SSL) \
perl(Term::ReadKey) \
perl(Time::HiRes)"

inherit rpm
