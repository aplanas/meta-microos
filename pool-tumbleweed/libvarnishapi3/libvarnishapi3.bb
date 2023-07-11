SUMMARY = "Shared libraries for Varnish"
DESCRIPTION = "Varnish is an HTTP accelerator. Often called Reverse Proxy, it is an \
application that stores (caches) documents that have been requested \
over the HTTP protocol. \
 \
Based on certain criteria, the next client requesting the document is either \
given the cached document, or a 'fresh' document requested from a backend \
server. The purpose of this is to minimize the requests going to the backend \
server(s) by serving the same document to potentially many users. \
 \
This package holds the shared libraries for varnish."
LICENSE = "BSD-2-Clause"

PV = "7.2.1"

RPM_NAME = "libvarnishapi3-7.2.1-1.4.aarch64.rpm"
RPM_HASH = "199473ee827254b64ca57b8c5a60a392ec5ccbc179e3d2b49275d7f08f1cd03f93168a6b0f9705419f4085905bd1b2f096c4de7581eda5fd24e32b8a0a490d39"

RPROVIDES:${PN} += "libvarnishapi.so.3 \
libvarnishapi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpcre2-8.so.0"

inherit rpm
