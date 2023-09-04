SUMMARY = "Git tools for sending email"
DESCRIPTION = "Email interface for the GIT version control system."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-email-2.41.0-1.3.aarch64.rpm"
RPM_HASH = "c85c49ab290337f293041d28752a76d6cfb5b6c2f2057a4e615fad33284d8c8b58ecc3f2f746760fcc20bb14bc44a9a7f833a3392135f891b348f66bc021a077"

RPROVIDES:${PN} += "git-email"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core \
perl-Authen-SASL \
perl-Git \
perl-MailTools \
perl-Net-SMTP-SSL"

inherit rpm
