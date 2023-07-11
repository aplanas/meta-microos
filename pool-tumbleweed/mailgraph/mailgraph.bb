SUMMARY = "RRDtool frontend for Mail statistics"
DESCRIPTION = "Mailgraph is a very simple mail statistics RRDtool frontend for Postfix \
that produces daily, weekly, monthly and yearly graphs of received/sent \
and bounced/rejected mail (SMTP traffic)."
LICENSE = "GPL-2.0-or-later"

PV = "1.14"

RPM_NAME = "mailgraph-1.14-9.7.noarch.rpm"
RPM_HASH = "f5ddd57d2f566d853225de9d51a5009ba93471bf0017112b89bb328936f2d5d50851aaf465577d501a5ebe1558c67a2934b153e31624642dc346e393dfac695e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/srv/www/htdocs/css \
config-mailgraph \
mailgraph"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
logrotate \
perl-File--Tail \
perl-RRDs \
postfix \
rrdtool \
systemd"

inherit rpm
