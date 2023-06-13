SUMMARY = "Shared library for httrack"
DESCRIPTION = "This package contains the httrack shared libraries."
LICENSE = "GPL-3.0-or-later"

PV = "3.49.2"

RPM_NAME = "libhttrack2-3.49.2-2.8.aarch64.rpm"
RPM_HASH = "fbc89195c344a2d01d90a73f69689557bc752d71da905743abd8b9ed0a2a20e439358cf458b0aef89972a3b68ecbccfd2e5237fec2d7ceaa6c0dc4f54c9c4192"

RPROVIDES:${PN} += "libbaselinks.so.1()(64bit) \
libchangecontent.so.1()(64bit) \
libcontentfilter.so.1()(64bit) \
libdisplayheader.so.1()(64bit) \
libfilename.so.1()(64bit) \
libfilename2.so.1()(64bit) \
libfilenameiisbug.so.1()(64bit) \
libhtsjava.so.2()(64bit) \
libhttrack.so.2()(64bit) \
libhttrack2 \
libhttrack2(aarch-64) \
liblistlinks.so.1()(64bit) \
liblog.so.1()(64bit) \
libsimple.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libssl.so.3()(64bit) \
libz.so.1()(64bit)"

inherit rpm
