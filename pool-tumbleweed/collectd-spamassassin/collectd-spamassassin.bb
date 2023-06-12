SUMMARY = "Spamassassin Monitoring for collectd"
DESCRIPTION = "Plugin for filling collectd with statistics from the \
SpamAsssassin anti-spam engine."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-spamassassin-5.12.0.134.g4cebbfc-1.4.noarch.rpm"
RPM_HASH = "992e2187c5d3c50a528fdfefb641211551a1d675525fb58451373c9e0b6223aee9def6f71b6cc1a5c638bca28789e3872f26218e54427df8bb1cb0bab911e57b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "collectd-spamassassin \
config(collectd-spamassassin) \
perl(Mail::SpamAssassin::Plugin::Collectd)"
RDEPENDS:${PN} += "collectd \
perl-spamassassin"

inherit rpm
