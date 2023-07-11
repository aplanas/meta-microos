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

RPM_NAME = "perl-MailTools-2.21-1.16.noarch.rpm"
RPM_HASH = "c588862984945b5b345efc60ed824cb52ca78d9fcf092cec5ef1c06539fd47f41e5a56ee3524391310bb6140de82a4eea65c4aa8730d032f8ee23e8ac5740e09"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Date--Format \
perl-Date--Parse"

inherit rpm
