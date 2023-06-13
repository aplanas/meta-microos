SUMMARY = "MPEG-2 Decoder"
DESCRIPTION = "An MPEG2Decoder based on the libmpeg2 libraries."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "mpeg2dec-0.5.1-3.12.aarch64.rpm"
RPM_HASH = "c7bb52d45e87eb0f80963013090b8bb1e18d84799b78e006121e083e01ec3722dad040bdf39ebd90fd739948f2099c6c11ccdc4a1db649dd0a23fb8000ee65db"

RPROVIDES:${PN} += "mpeg2dec \
mpeg2dec(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmpeg2-0 \
libmpeg2.so.0()(64bit) \
libmpeg2convert.so.0()(64bit) \
libmpeg2convert0"

inherit rpm
