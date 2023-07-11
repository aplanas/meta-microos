SUMMARY = "(DEPRECATED) module for sending mails with attachments through an SMTP server"
DESCRIPTION = "Mail::Sender is deprecated. Email::Sender is the go-to choice when you need \
to send Email from Perl. Go there, be happy! \
 \
Mail::Sender provides an object-oriented interface to sending mails. It \
directly connects to the mail server using IO::Socket."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.903"

RPM_NAME = "perl-Mail-Sender-0.903-1.24.noarch.rpm"
RPM_HASH = "aa7de1bb1d82d8168ea4809cfb6cb9c79cb0b18498b94deb1ab8d590bc6863642f52919c41f248f8f0ee90ae9b3c74ee1f13cc6dcb2b80ad48c8867d7a5eca8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--Sender \
perl-Mail--Sender--CType--Ext \
perl-Mail--Sender--CType--Win32 \
perl-Mail-Sender"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
