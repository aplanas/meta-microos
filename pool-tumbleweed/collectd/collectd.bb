SUMMARY = "Statistics Collection Daemon for filling RRD Files"
DESCRIPTION = "collectd is a daemon (written in C) that reads various system \
statistics and updates RRD files. Statistics are very fine grained \
with an update interval of 10 seconds."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "76272728c3daa26742382e227a65ff5c04c3f498cac91060ddd7e8db65e0b5184d733992f6219339bf117bc479534c0b4c95ae027a4bf35da2620e014670692a"

RPROVIDES:${PN} += "collectd \
collectd-beta \
config-collectd \
perl-Collectd \
perl-Collectd--Plugins--OpenVZ \
perl-Collectd--Unixsock"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcollectdclient.so.1 \
libcurl.so.4 \
libesmtp.so.6.2.0 \
libgcrypt.so.20 \
libip4tc.so.2 \
libip6tc.so.2 \
libjansson.so.4 \
libm.so.6 \
libmicrohttpd.so.12 \
libmnl.so.0 \
liboping.so.0 \
libpcap.so.1 \
libperl.so \
libprotobuf-c.so.1 \
librrd.so.8 \
libsensors.so.4 \
libudev.so.1 \
libxml2.so.2 \
libyajl.so.2 \
rrdtool \
sensors \
systemd"

inherit rpm
