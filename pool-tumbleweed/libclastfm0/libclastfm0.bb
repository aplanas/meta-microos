SUMMARY = "Unofficial C-API for the Last.fm Web Service"
DESCRIPTION = "libclastfm shared library. \
 \
libclastfm is an unofficial C-API for the Last.fm web service written \
with libcurl. Has support for Album, Artist and User API methods as well \
as full audio scrobbler support."
LICENSE = "GPL-3.0+"

PV = "0.5"

RPM_NAME = "libclastfm0-0.5-9.26.aarch64.rpm"
RPM_HASH = "6f60c7c1e56c980d8133c82dc6525ba8c9e3bca32d4c68d72e0d281c1947bf8c9ed33b5eb3d301081334659b64d21e0592f284c64215b6d6db7a8a820f1882e9"

RPROVIDES:${PN} += "libclastfm.so.0 \
libclastfm0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4"

inherit rpm
