SUMMARY = "WebDAV module for Lighttpd"
DESCRIPTION = "The WebDAV module is a very minimalistic implementation of RFC 2518. \
Minimalistic means that not all operations are implementated yet.. \
 \
So far we have: \
* PROPFIND \
* OPTIONS \
* MKCOL \
* DELETE \
* PUT \
and the usual GET, POST, HEAD from HTTP/1.1.. \
 \
So far mounting a webdav resource into Windows XP works and the basic \
litmus tests are passed."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_webdav-1.4.71-1.2.aarch64.rpm"
RPM_HASH = "c30291862da0101fcd42e30f159ca868887022e0135a600fca24969d1afc9f195abee69fccc6b17a2d1cd2311c8c8f1b0442dd8e8594e8fe4cadb3b07ea19569"

RPROVIDES:${PN} += "config-lighttpd-mod-webdav \
lighttpd-mod-webdav"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
libuuid.so.1 \
libxml2.so.2 \
lighttpd"

inherit rpm
