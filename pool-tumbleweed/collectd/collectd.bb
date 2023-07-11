SUMMARY = "Statistics Collection Daemon for filling RRD Files"
DESCRIPTION = "collectd is a daemon (written in C) that reads various system \
statistics and updates RRD files. Statistics are very fine grained \
with an update interval of 10 seconds."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "11f89a25e617ba98ed7366e45c3dc4fbe0cb4ba9e3dd0e605b3be502a9334129f9da4f4d889d8f2ee54ffd39a02f7655b0cbbc1863c3c221e3aeb55e3501b016"

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
