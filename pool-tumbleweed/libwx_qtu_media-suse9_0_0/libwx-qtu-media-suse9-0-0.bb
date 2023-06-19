SUMMARY = "wxWidgets media class library"
DESCRIPTION = "wxMediaCtrl is a class for displaying types of media, such as videos, \
audio files, natively through native codecs."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_media-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "86c5c6450d965a1e1d3758358f11f96175b753b647e5428642474ddde8b722b58d07fab94021e50fab4bc22c492e086fc6fe1c4894951958df374c056b882578"

RPROVIDES:${PN} += "libwx-qtu-media-suse.so.9.0.0 \
libwx-qtu-media-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-qtu-core-suse.so.9.0.0"

inherit rpm
