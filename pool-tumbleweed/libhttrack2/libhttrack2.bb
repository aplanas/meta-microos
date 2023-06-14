SUMMARY = "Shared library for httrack"
DESCRIPTION = "This package contains the httrack shared libraries."
LICENSE = "GPL-3.0-or-later"

PV = "3.49.2"

RPM_NAME = "libhttrack2-3.49.2-2.8.aarch64.rpm"
RPM_HASH = "fbc89195c344a2d01d90a73f69689557bc752d71da905743abd8b9ed0a2a20e439358cf458b0aef89972a3b68ecbccfd2e5237fec2d7ceaa6c0dc4f54c9c4192"

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
