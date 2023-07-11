SUMMARY = "Web Frontend for watching the collectd Statistics"
DESCRIPTION = "Web frontend CGI for watching collectd statistics from a browser. \
 \
Please look at /etc/apache2/conf.d/collectd.conf on how to enable."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-web-5.12.0.134.g4cebbfc-1.6.noarch.rpm"
RPM_HASH = "8fe755c17862d2ab4609c5eddfc1451a82e574c9b0dc856cc082cc3eac02468305e6f9d22cb84a18b612d095cac9a562305ff108981230b488a20a078b00b033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "collectd-web \
config-collectd-web"

RDEPENDS:${PN} += "/usr/bin/perl \
apache2 \
perl \
perl-CGI \
perl-Data--Dumper \
perl-HTML--Entities \
perl-RRDs \
perl-URI--Escape \
rrdtool"

inherit rpm
