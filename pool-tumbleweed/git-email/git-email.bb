SUMMARY = "Git tools for sending email"
DESCRIPTION = "Email interface for the GIT version control system."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-email-2.41.0-1.2.aarch64.rpm"
RPM_HASH = "cf262b350b36e554215762621763a26f97c0fa0a89f202100c6023261e79312d8ba368e1e214c391c63cd05c88be98364fcf2d098900c7839e5c6146ed31ebde"

RPROVIDES:${PN} += "git-email"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core \
perl-Authen-SASL \
perl-Git \
perl-MailTools \
perl-Net-SMTP-SSL"

inherit rpm
