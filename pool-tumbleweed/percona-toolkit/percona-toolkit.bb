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

RPM_NAME = "percona-toolkit-3.3.1-2.13.aarch64.rpm"
RPM_HASH = "3bd05a8728ff2d2acf45e3200b4eee67ccf965fb5db599e88c32ac4f4370c0ad03ac6061fc8ef7ea2207ce3260b054aeba6e35ebe1dbab58bfd286ebfd214b91"

RPROVIDES:${PN} += "config-percona-toolkit \
maatkit \
percona-toolkit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-DBD--mysql \
perl-DBI \
perl-IO--Socket--SSL \
perl-Term--ReadKey \
perl-Time--HiRes"

inherit rpm
