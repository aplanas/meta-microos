SUMMARY = "Nginx virtual host traffic status module"
DESCRIPTION = "This is an Nginx module that provides access to virtual host status \
information. It contains the current status such as servers, upstreams, caches. \
This is similar to the live activity monitoring of nginx plus. The built-in html \
is also taken from the demo page of old version."
LICENSE = "BSD-2-Clause"

PV = "0.2.2"

RPM_NAME = "nginx-module-vts-0.2.2-1.2.aarch64.rpm"
RPM_HASH = "abab72261a62cd4460a7a4ea073fb00c0985d20a85be385631829a7aaf9f3b222976b697ccb5535cf48dba8a5164ad236f232596721baf239b24b3d505b8b50e"

RPROVIDES:${PN} += "nginx-module-vts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
nginx"

inherit rpm
