SUMMARY = "Library for Working With Cue Sheet (cue) and Table Of Contents (toc) Files"
DESCRIPTION = "libcuefile is a library for working with Cue Sheet (cue) and Table of Contents \
(toc) files."
LICENSE = "GPL-2.0-only"

PV = "r475"

RPM_NAME = "libcuefile0-r475-2.15.aarch64.rpm"
RPM_HASH = "e0710649bbf94f0aa59247166c66fb58d72108f3d191b9b750048f550e68c10627df0abe51fba3aa76ebeca4e4971e9f504d0cdd0f7f4b2c31dd11d132552d25"

RPROVIDES:${PN} += "libcuefile.so.0()(64bit) \
libcuefile0 \
libcuefile0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
