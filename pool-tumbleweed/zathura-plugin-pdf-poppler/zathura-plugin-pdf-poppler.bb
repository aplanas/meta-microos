SUMMARY = "PDF support for zathura via poppler"
DESCRIPTION = "The zathura-pdf-poppler plugin adds PDF support to zathura by using the poppler rendering engine."
LICENSE = "Zlib"

PV = "0.3.1"

RPM_NAME = "zathura-plugin-pdf-poppler-0.3.1-1.2.aarch64.rpm"
RPM_HASH = "98fecc881b247d2f02eb2d78af0a7bdbad8cd61eceb9508397c80304d4d93c0a2591d1c02ea2ba1f72a6f296780434051b93320d4d940c6542c7319e6026bcc2"

RPROVIDES:${PN} += "libpdf-poppler.so()(64bit) \
metainfo() \
metainfo(org.pwmt.zathura-pdf-poppler.metainfo.xml) \
zathura-pdf-poppler-plugin \
zathura-plugin-pdf-poppler \
zathura-plugin-pdf-poppler(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgirara-gtk3.so.3()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpoppler-glib.so.8()(64bit) \
zathura"

inherit rpm
