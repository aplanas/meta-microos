SUMMARY = "Unofficial C-API for the Last.fm Web Service"
DESCRIPTION = "libclastfm shared library. \
 \
libclastfm is an unofficial C-API for the Last.fm web service written \
with libcurl. Has support for Album, Artist and User API methods as well \
as full audio scrobbler support."
LICENSE = "GPL-3.0+"

PV = "0.5"

RPM_NAME = "libclastfm0-0.5-9.27.aarch64.rpm"
RPM_HASH = "cf1795bfe7c100fad31e901ccb361ab61eb55a48b954740895066a5bd9f18c0a603d77f9548fc570960e4b62f103de450cec15209ec1701efcf166a0702e98de"

RPROVIDES:${PN} += "libclastfm.so.0 \
libclastfm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4"

inherit rpm
