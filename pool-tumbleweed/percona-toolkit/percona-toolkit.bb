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

RPM_NAME = "percona-toolkit-3.3.1-2.14.aarch64.rpm"
RPM_HASH = "3a882fd0ac2a6dcf9ae96107b4bf2eda00330f55f5f47b9bde7e5cc5bec63be2a4b62239aee21a6d6e32da442b64306fd30bcffc0795a85144f0a9505f6b5681"

RPROVIDES:${PN} += "config-percona-toolkit \
maatkit \
percona-toolkit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-DBD--mysql \
perl-DBI \
perl-IO--Socket--SSL \
perl-Term--ReadKey \
perl-Time--HiRes"

inherit rpm
