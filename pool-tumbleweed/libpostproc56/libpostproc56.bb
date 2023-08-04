SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libpostproc56-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "44a553ae7319fc304d4671aaf535aaad6945366adcccc432bf1e496183eecf8739d1d95bc516a16d18770918817db920bf0fd97dc91fd0ee685e8cd4cd53007c"

RPROVIDES:${PN} += "libpostproc.so.56 \
libpostproc56"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.57 \
libavutil57 \
libc.so.6"

inherit rpm
