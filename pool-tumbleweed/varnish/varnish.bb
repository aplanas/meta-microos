SUMMARY = "Accelerator for HTTP services"
DESCRIPTION = "Varnish is an HTTP accelerator. Often called Reverse Proxy, it is an \
application that stores (caches) documents that have been requested \
over the HTTP protocol. \
 \
Based on certain criteria, the next client requesting the document is either \
given the cached document, or a 'fresh' document requested from a backend \
server. The purpose of this is to minimize the requests going to the backend \
server(s) by serving the same document to potentially many users."
LICENSE = "BSD-2-Clause"

PV = "7.2.1"

RPM_NAME = "varnish-7.2.1-1.4.aarch64.rpm"
RPM_HASH = "c5a6de2466a3139b3efcfce48ad7c554ed0d44f7ccd53632fd867f7b751f768d8cd8de27946c81f6f3f9f75a8ee7e26676cd834d41e3b2b39e945d4bbdb3f9eb"

RPROVIDES:${PN} += "config-varnish \
libvmod-blob.so \
libvmod-cookie.so \
libvmod-debug.so \
libvmod-directors.so \
libvmod-proxy.so \
libvmod-purge.so \
libvmod-std.so \
libvmod-unix.so \
libvmod-vtc.so \
varnish"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
c-compiler \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libpcre2-8.so.0 \
libreadline.so.8 \
libtinfo.so.6 \
libvarnishapi.so.3"

inherit rpm
