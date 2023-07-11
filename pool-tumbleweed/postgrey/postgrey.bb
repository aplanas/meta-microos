SUMMARY = "Postfix greylisting policy server"
DESCRIPTION = "Postgrey is a Postfix policy server implementing greylisting. When a \
request for delivery of a mail is received by Postfix via SMTP, the \
triplet CLIENT_IP / SENDER / RECIPIENT is built. If it is the first \
time that this triplet is seen, or if the triplet was first seen less \
than 5 minutes, then the mail gets rejected with a temporary error. \
Hopefully spammers or viruses will not try again later, as it is \
however required per RFC. \
 \
The following features compared with greylist.pl from Postfix 2.1.1 are \
new: Safe database, automatic maintenance, whitelists, lookup by \
subnet, auto-whitelisting of clients, only Berkeley DB and no large \
mysql nor postgresql DB needed."
LICENSE = "GPL-2.0-or-later"

PV = "1.37"

RPM_NAME = "postgrey-1.37-7.7.noarch.rpm"
RPM_HASH = "93bdcd85539e1ff1f84017090b18d1341dd9db4a949dd55c516796138098331d1657b8e5eeb956e9aa0e59d029021f6a43e0164cba1086de961fe8128836cb14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-postgrey \
postgrey"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-nogroup \
perl \
perl-BerkeleyDB \
perl-IO-Multiplex \
perl-Net-DNS \
perl-Net-Server \
perl-NetAddr-IP"

inherit rpm
