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

RPM_NAME = "lighttpd-mod_webdav-1.4.71-1.1.aarch64.rpm"
RPM_HASH = "52d664b01f58c4764ff6b7a99a7c5dfbb9e8f14b48ee51e381fd7c29692e79220fd467aa0608487b249df404cc9046b705841a10e526c8e5d70cfa1005b85b4f"

RPROVIDES:${PN} += "config-lighttpd-mod-webdav \
lighttpd-mod-webdav"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
libuuid.so.1 \
libxml2.so.2 \
lighttpd"

inherit rpm
