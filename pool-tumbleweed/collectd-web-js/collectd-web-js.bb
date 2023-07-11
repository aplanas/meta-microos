SUMMARY = "Web/JavaScript Frontend for watching collectd Statistics"
DESCRIPTION = "Web/JavaScript frontend CGI for watching collectd statistics from \
a browser. \
 \
Please look at /etc/apache2/conf.d/collectd-js.conf on how to \
enable."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-web-js-5.12.0.134.g4cebbfc-1.6.noarch.rpm"
RPM_HASH = "5177a50237a1559e3ba84fd77e4b435b89c70c73701840e246d20c7f65d84e2e23e0ba361c66f91eb8bce724263dfd6efe28fe4120bef0325ef5199b2670da33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "collectd-web-js \
config-collectd-web-js \
perl-Collectd--Graph--Common \
perl-Collectd--Graph--Config \
perl-Collectd--Graph--Type \
perl-Collectd--Graph--Type--ArcCounts \
perl-Collectd--Graph--Type--Df \
perl-Collectd--Graph--Type--GenericIO \
perl-Collectd--Graph--Type--GenericStacked \
perl-Collectd--Graph--Type--JavaMemory \
perl-Collectd--Graph--Type--Load \
perl-Collectd--Graph--Type--PsCputime \
perl-Collectd--Graph--Type--TableSize \
perl-Collectd--Graph--Type--Wirkleistung \
perl-Collectd--Graph--TypeLoader"

RDEPENDS:${PN} += "/usr/bin/perl \
apache2 \
perl \
perl-CGI \
perl-Config--General \
perl-Data--Dumper \
perl-HTML--Entities \
perl-JSON \
perl-RRDs \
rrdtool"

inherit rpm
