SUMMARY = "A top Clone for MySQL"
DESCRIPTION = "mytop is a console-based (non-GUI) tool for monitoring the threads and \
overall performance of MySQL 3.22.x, 3.23.x, and 4.x servers. \
 \
- With Term::ANSIColor installed you even get color. \
 \
- If you install Time::HiRes, get good real-time queries/second stats."
LICENSE = "GPL-2.0+"

PV = "1.6"

RPM_NAME = "mytop-1.6-104.28.noarch.rpm"
RPM_HASH = "d2a4337310e7fd8b1de89477a06428ddc77bde8a474a7a06bfeae30b2a4fe9da9f86df0d25c35732cc192dad4916f799b43b98c0f9c736e56673b3812cfa8ea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mytop"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-DBD-mysql \
perl-DBI \
perl-TermReadKey"

inherit rpm
