SUMMARY = "Support library for subtitleeditor"
DESCRIPTION = "Support library for subtitleeditor, a GTK+3 tool to edit subtitles."
LICENSE = "GPL-3.0"

PV = "0.54.0"

RPM_NAME = "libsubtitleeditor0-0.54.0-4.17.aarch64.rpm"
RPM_HASH = "a236d49cd44a58a72b9ea4e798441e7a2605a5365383fed6aa07978925de63e06ca833811043c893500915073c07b1783bdd1e2cdbcde62b27c42aad1bd8af65"

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
