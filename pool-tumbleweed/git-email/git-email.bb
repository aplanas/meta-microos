SUMMARY = "Git tools for sending email"
DESCRIPTION = "Email interface for the GIT version control system."
LICENSE = "GPL-2.0-only"

PV = "2.42.0"

RPM_NAME = "git-email-2.42.0-1.1.aarch64.rpm"
RPM_HASH = "18231959cf08a0cc292e9cd2895a7ecf682b1361030ae390893514ffdf17112b047bdca47285366c9ee7f5d5ced209c3a9b72529c795b544e897ead7ee0f3bd1"

RPROVIDES:${PN} += "git-email"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core \
perl-Authen-SASL \
perl-Git \
perl-MailTools \
perl-Net-SMTP-SSL"

inherit rpm
