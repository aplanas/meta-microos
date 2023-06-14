SUMMARY = "Git tools for sending email"
DESCRIPTION = "Email interface for the GIT version control system."
LICENSE = "GPL-2.0-only"

PV = "2.40.1"

RPM_NAME = "git-email-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "ceb08dfc249c8df94d8b955e423c0f0b408b316912379ac0aad2cf7018ed2d194815828b8dabe607edce32bafc524001f657f0d51b0802c061ebea5f2c4a42d7"

RPROVIDES:${PN} += "git-email"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core \
perl-Authen-SASL \
perl-Git \
perl-MailTools \
perl-Net-SMTP-SSL"

inherit rpm
