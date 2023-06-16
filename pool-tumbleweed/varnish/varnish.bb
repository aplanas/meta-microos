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

RPM_NAME = "varnish-7.2.1-1.3.aarch64.rpm"
RPM_HASH = "876c822757a9e881c75e8ef1f644cc8192b542e9c7e2f01dc7b6b2fc4722b10aabdf2b41fc64062625327d526074676ffc12b56d5d251edbfe429515f1e8c5e0"

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
