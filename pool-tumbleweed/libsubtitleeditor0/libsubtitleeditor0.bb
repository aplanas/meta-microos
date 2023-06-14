SUMMARY = "Support library for subtitleeditor"
DESCRIPTION = "Support library for subtitleeditor, a GTK+3 tool to edit subtitles."
LICENSE = "GPL-3.0"

PV = "0.54.0"

RPM_NAME = "libsubtitleeditor0-0.54.0-4.16.aarch64.rpm"
RPM_HASH = "af64ddf708063b6c79036c63056bd9244fc5a56333afee9bcccec5b9ed407da80d82f4982aa96531005760c19b5b4254ce2317df2481420cb178b220b427b4f0"

RPROVIDES:${PN} += "libsubtitleeditor.so.0 \
libsubtitleeditor0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libenchant.so.1 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgtkmm-3.0.so.1 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libxml++-2.6.so.2"

inherit rpm
