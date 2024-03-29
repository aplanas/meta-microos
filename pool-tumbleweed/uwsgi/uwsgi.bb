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
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "4c7afc2ae2d0504149d20b66a8cf5741df3f592f885283d9686c2fde53d4bfff289b3efa187de79ac0a8970589c105c883f5d7dec1b07b2fc90eda4dba849928"

RPROVIDES:${PN} += "config-uwsgi \
uwsgi \
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

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libcurl.so.4 \
libjansson.so.4 \
libm.so.6 \
libpcre.so.1 \
libssl.so.3 \
libsystemd.so.0 \
libuuid.so.1 \
libwrap.so.0 \
libxml2.so.2 \
libz.so.1 \
systemd"

inherit rpm
