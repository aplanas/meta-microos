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

RPM_NAME = "eximstats-html-4.96-5.3.aarch64.rpm"
RPM_HASH = "22b1885046cb4709f712da253306e76793ea07b42765a86e6b734f02677be248909af2ade4e0236b0c012b192a76b70012c76a5f8323d4988b9531caa7b0ff64"

RPROVIDES:${PN} += "config-eximstats-html \
eximstats-html"

RDEPENDS:${PN} += "/usr/bin/python3 \
perl-GD \
perl-GDGraph \
perl-GDTextUtil"

inherit rpm
