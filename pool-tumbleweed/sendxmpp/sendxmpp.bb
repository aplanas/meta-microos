SUMMARY = "A perl-script to send xmpp, similar to what mail does for mail"
DESCRIPTION = "sendxmpp is a perl-script to send xmpp (jabber), similar to \
what mail(1) does for mail."
LICENSE = "GPL-2.0-only"

PV = "1.24"

RPM_NAME = "sendxmpp-1.24-3.3.noarch.rpm"
RPM_HASH = "33f7191918f7c7ecd4ca45fe43dab32f6d29bb58ac7d929df2acc96e5b185d500b0cc37d44212636462eb20663f23030ac8e5c4027e40d4375279dd6e6c1a6a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sendxmpp"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-IO--Socket--SSL \
perl-Net--XMPP"

inherit rpm
