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

RPM_NAME = "perl-MailTools-2.21-1.15.noarch.rpm"
RPM_HASH = "ea5ff8d765c8a3727997617bec0b535ac7a18e9dd019d3a0dcd911b649d6996253ab8267970bfa8ff0717b1cc8fa608d046725715fdfa4bd7b97d6c14326d04d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mail::Address) \
perl(Mail::Cap) \
perl(Mail::Field) \
perl(Mail::Field::AddrList) \
perl(Mail::Field::Date) \
perl(Mail::Field::Generic) \
perl(Mail::Filter) \
perl(Mail::Header) \
perl(Mail::Internet) \
perl(Mail::Mailer) \
perl(Mail::Mailer::qmail) \
perl(Mail::Mailer::rfc822) \
perl(Mail::Mailer::sendmail) \
perl(Mail::Mailer::smtp) \
perl(Mail::Mailer::smtp::pipe) \
perl(Mail::Mailer::smtps) \
perl(Mail::Mailer::smtps::pipe) \
perl(Mail::Mailer::testfile) \
perl(Mail::Mailer::testfile::pipe) \
perl(Mail::Send) \
perl(Mail::Util) \
perl(MailTools) \
perl-MailTools"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Date::Format) \
perl(Date::Parse)"

inherit rpm
