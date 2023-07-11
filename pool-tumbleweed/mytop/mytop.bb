SUMMARY = "A top Clone for MySQL"
DESCRIPTION = "mytop is a console-based (non-GUI) tool for monitoring the threads and \
overall performance of MySQL 3.22.x, 3.23.x, and 4.x servers. \
 \
- With Term::ANSIColor installed you even get color. \
 \
- If you install Time::HiRes, get good real-time queries/second stats."
LICENSE = "GPL-2.0+"

PV = "1.6"

RPM_NAME = "mytop-1.6-104.27.noarch.rpm"
RPM_HASH = "b374b6428adcb6d8af77aaf63d27e97cf08f0b66b66d92080ab285d28febc910db4267efb29442c7066379380a11087105222ead23be5f912cd6d891352fc26f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mytop"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-DBD-mysql \
perl-DBI \
perl-TermReadKey"

inherit rpm
