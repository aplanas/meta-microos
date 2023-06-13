SUMMARY = "Create HTML reports of exim logs"
DESCRIPTION = "If this package is installed alongside the exim MTA, and you enable \
EXIM_REPORT_WEEKLY_HTML in /etc/sysconfig/exim, logrotate/cron will \
create HTML reports in /srv/www/eximstats. \
 \
You can edit /etc/apache2/conf.d/eximstats.conf to configure your \
webserver for the reports. \
 \
The script /usr/sbin/eximstats-html-update.py can create the reports \
for log files that were rotated in the past. (You would only run this \
once, if at all. The rest is done by logrotate / cron.)"
LICENSE = "GPL-2.0-or-later"

PV = "4.96"

RPM_NAME = "eximstats-html-4.96-5.1.aarch64.rpm"
RPM_HASH = "7aca441033db201706762aa81f8276135a08ea284b7914526996eeb45ccd9f3c5576e2d6a1943a9d2b7ebe999c9a75290d6bed1ec69f2363773ffbc364edcabe"

RPROVIDES:${PN} += "config(eximstats-html) \
eximstats-html \
eximstats-html(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
perl-GD \
perl-GDGraph \
perl-GDTextUtil"

inherit rpm
