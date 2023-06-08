SUMMARY = "Statistics Collection Daemon for filling RRD Files"
DESCRIPTION = "collectd is a daemon (written in C) that reads various system \
statistics and updates RRD files. Statistics are very fine grained \
with an update interval of 10 seconds."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "76272728c3daa26742382e227a65ff5c04c3f498cac91060ddd7e8db65e0b5184d733992f6219339bf117bc479534c0b4c95ae027a4bf35da2620e014670692a"

RPROVIDES:${PN} += "collectd collectd(aarch-64) collectd-beta config(collectd) perl(Collectd) perl(Collectd::Plugins::OpenVZ) perl(Collectd::Unixsock)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/perl /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcollectdclient.so.1()(64bit) libcurl.so.4()(64bit) libesmtp.so.6.2.0()(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libip4tc.so.2()(64bit) libip6tc.so.2()(64bit) libjansson.so.4()(64bit) libjansson.so.4(libjansson.so.4)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmicrohttpd.so.12()(64bit) libmnl.so.0()(64bit) libmnl.so.0(LIBMNL_1.0)(64bit) liboping.so.0()(64bit) libpcap.so.1()(64bit) libperl.so()(64bit) libprotobuf-c.so.1()(64bit) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) librrd.so.8()(64bit) libsensors.so.4()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libyajl.so.2()(64bit) rrdtool sensors systemd"

inherit rpm
