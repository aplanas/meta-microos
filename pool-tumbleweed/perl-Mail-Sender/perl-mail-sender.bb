SUMMARY = "(DEPRECATED) module for sending mails with attachments through an SMTP server"
DESCRIPTION = "Mail::Sender is deprecated. Email::Sender is the go-to choice when you need \
to send Email from Perl. Go there, be happy! \
 \
Mail::Sender provides an object-oriented interface to sending mails. It \
directly connects to the mail server using IO::Socket."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.903"

RPM_NAME = "perl-Mail-Sender-0.903-1.25.noarch.rpm"
RPM_HASH = "ed9f9cfa97d3e36d7c0306add7854b13337b8f2428cea8271ce830dc02e04799e3e39d95e24ad14a58d5d7324b52b2e9a7113ab3489037ff0addf3932b0d91bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Sender \
perl-Mail--Sender--CType--Ext \
perl-Mail--Sender--CType--Win32 \
perl-Mail-Sender"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
