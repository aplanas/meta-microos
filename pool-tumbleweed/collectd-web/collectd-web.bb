SUMMARY = "Web Frontend for watching the collectd Statistics"
DESCRIPTION = "Web frontend CGI for watching collectd statistics from a browser. \
 \
Please look at /etc/apache2/conf.d/collectd.conf on how to enable."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-web-5.12.0.134.g4cebbfc-1.4.noarch.rpm"
RPM_HASH = "bd571cdb9612b9967c0df65f26678d49ff7ca594e1f983f5360e1e7b55ec7b56a6baa963faa1eca7558eaa914e3a94e8c92cb4e29f8fac7a095bef1abb69165d"
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
