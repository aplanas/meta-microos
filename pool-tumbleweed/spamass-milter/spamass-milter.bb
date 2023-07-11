SUMMARY = "Milter (mail filter) for spamassassin"
DESCRIPTION = "A milter (Mail Filter) application that pipes incoming mail (including things \
received by rmail/UUCP) through SpamAssassin, a highly customizable spam \
filter. A milter-compatible MTA such as Sendmail or Postfix is required."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "spamass-milter-0.4.0-3.7.aarch64.rpm"
RPM_HASH = "66266473bec3131bd85ade3dda49742c0e98906354f18a87b212e39272c9a214816a6771ee769cbff625fe09947665bd4892d7acc0783ffe0d4eb69463767cce"

RPROVIDES:${PN} += "config-spamass-milter \
group-sa-milter \
spamass-milter \
user-sa-milter"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmilter.so.1.0 \
libstdc++.so.6 \
postfix \
spamassassin-spamc \
sysuser-shadow"

inherit rpm
