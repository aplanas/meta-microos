SUMMARY = "Shell script to send notifications when SSL certificates are about to expire"
DESCRIPTION = "ssl-cert-check is a Bourne shell script that can be used to report on expiring \
SSL certificates. The script was designed to be run from cron and can e-mail \
warnings or log alerts through nagios."
LICENSE = "GPL-2.0-only"

PV = "4.11git.1556282902.f3fc941"

RPM_NAME = "ssl-cert-check-4.11git.1556282902.f3fc941-1.10.noarch.rpm"
RPM_HASH = "cd253e7052235e82e76dc8a4eccc9e6c9f5fb13d166f1d432a83b0b2eb1504aef547ce132959c6d0bddacb52047d67fe001e098c22313ea29b7165fe051798b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-ssl-cert-check \
ssl-cert-check"
RDEPENDS:${PN} += "/bin/bash \
bash \
coreutils \
findutils \
gawk \
grep \
openssl \
sed"

inherit rpm
