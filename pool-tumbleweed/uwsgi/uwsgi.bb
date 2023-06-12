SUMMARY = "Application Container Server for Networked/Clustered Web Applications"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
It is a WSGI server with a stack for networked/clustered web applications, \
implementing message/object passing, caching, RPC and process management. \
 \
It uses the uwsgi protocol for all the networking/interprocess communications, \
but it can speak other protocols as well (http, fastcgi, mongrel2...) \
 \
It can be run in preforking mode, threaded, asynchronous/evented and supports \
various forms of green threads/coroutines (such as uGreen, Greenlet, Stackless, \
Gevent and Fiber). \
 \
Different plugins can be used in order to add compatibility with \
different technology on top of the same core."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "14f305b98c1ba7f213f54f6cd5eaec792bf341396ddafd5f566716f10560330fb01c2c108a216bc438c4a0f66b9ccbdc13ce75cde15463207cb8a62a618c4708"

RPROVIDES:${PN} += "config(uwsgi) \
uwsgi \
uwsgi(aarch-64) \
uwsgi-carbon \
uwsgi-cgi \
uwsgi-fastrouter \
uwsgi-graylog2 \
uwsgi-http \
uwsgi-logsocket \
uwsgi-nagios \
uwsgi-probepg \
uwsgi-redislog \
uwsgi-rrdtool \
uwsgi-rsyslog \
uwsgi-syslog \
uwsgi-ugreen \
uwsgi-zergpool"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpcre.so.1()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libwrap.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
systemd"

inherit rpm
