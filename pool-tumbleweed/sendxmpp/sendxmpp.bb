SUMMARY = "A perl-script to send xmpp, similar to what mail does for mail"
DESCRIPTION = "sendxmpp is a perl-script to send xmpp (jabber), similar to \
what mail(1) does for mail."
LICENSE = "GPL-2.0-only"

PV = "1.24"

RPM_NAME = "sendxmpp-1.24-3.4.noarch.rpm"
RPM_HASH = "783e3b2e7c7ab27f8a11810442e78c9cd49e46d791775b1bdb33f72b4f23b8c6ac08db232e267055ce4a032751c2c56adbb788c7b403cc6e6e2ff12a946dce81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sendxmpp"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-IO--Socket--SSL \
perl-Net--XMPP"

inherit rpm
