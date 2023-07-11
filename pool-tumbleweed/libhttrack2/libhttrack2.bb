SUMMARY = "Shared library for httrack"
DESCRIPTION = "This package contains the httrack shared libraries."
LICENSE = "GPL-3.0-or-later"

PV = "3.49.2"

RPM_NAME = "libhttrack2-3.49.2-2.9.aarch64.rpm"
RPM_HASH = "bff07c1a211e57c60f019576ce45d5ed16c53eb367cfdb58c9049e2412cee8b1425c15515d7e5386d996704b185c0195f9f83d0f81f41468dacccb20b36c58d0"

RPROVIDES:${PN} += "libbaselinks.so.1 \
libchangecontent.so.1 \
libcontentfilter.so.1 \
libdisplayheader.so.1 \
libfilename.so.1 \
libfilename2.so.1 \
libfilenameiisbug.so.1 \
libhtsjava.so.2 \
libhttrack.so.2 \
libhttrack2 \
liblistlinks.so.1 \
liblog.so.1 \
libsimple.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
