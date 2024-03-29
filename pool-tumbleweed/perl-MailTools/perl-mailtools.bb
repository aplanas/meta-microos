SUMMARY = "Bundle of ancient email modules"
DESCRIPTION = "MailTools is a bundle: an ancient form of combining packages into one \
distribution. Gladly, it can be distributed as if it is a normal \
distribution as well. \
 \
*Be warned:* The code you find here is very old. It works for simple \
emails, but when you start with new code then please use more sofisticated \
libraries. The main reason that you still find this code on CPAN, is \
because many books use it as example."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.21"

RPM_NAME = "perl-MailTools-2.21-1.17.noarch.rpm"
RPM_HASH = "01284ddd804446b1501844cd615f4b7fb5bd7a443bd8303d2d2c25182c2c2365c6dda7e22fcb94cc433bef1cb50e12c78b11f2c5188d53466f0b8dc48deb9f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Address \
perl-Mail--Cap \
perl-Mail--Field \
perl-Mail--Field--AddrList \
perl-Mail--Field--Date \
perl-Mail--Field--Generic \
perl-Mail--Filter \
perl-Mail--Header \
perl-Mail--Internet \
perl-Mail--Mailer \
perl-Mail--Mailer--qmail \
perl-Mail--Mailer--rfc822 \
perl-Mail--Mailer--sendmail \
perl-Mail--Mailer--smtp \
perl-Mail--Mailer--smtp--pipe \
perl-Mail--Mailer--smtps \
perl-Mail--Mailer--smtps--pipe \
perl-Mail--Mailer--testfile \
perl-Mail--Mailer--testfile--pipe \
perl-Mail--Send \
perl-Mail--Util \
perl-MailTools"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Date--Format \
perl-Date--Parse"

inherit rpm
