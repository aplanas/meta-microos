SUMMARY = "Spamassassin Monitoring for collectd"
DESCRIPTION = "Plugin for filling collectd with statistics from the \
SpamAsssassin anti-spam engine."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-spamassassin-5.12.0.134.g4cebbfc-1.6.noarch.rpm"
RPM_HASH = "66eda189cf347d97cca8d96435220cf9be073f23c8d245ab72d75527c3e23e3dda9d16c0bd788e2840a93d54000bdcf5dd05fa7b979fb254f15c198e8f5f2821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "collectd-spamassassin \
config-collectd-spamassassin \
perl-Mail--SpamAssassin--Plugin--Collectd"

RDEPENDS:${PN} += "collectd \
perl-spamassassin"

inherit rpm
