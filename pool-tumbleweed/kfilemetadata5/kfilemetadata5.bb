SUMMARY = "Library for extracting Metadata"
DESCRIPTION = "A library for extracting file metadata."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "kfilemetadata5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "36b724393b05b0799cc9dd54f8b5ed82695f56e28574d6ed8a7cd2e6227a65ae370534f7b597529a6223247d5e64856acc09a17a40b5c36af64974b818ccb73d"

RPROVIDES:${PN} += "kfilemetadata5 \
kfilemetadata5(aarch-64) \
libKF5FileMetaData.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libepub.so.0()(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpoppler-qt5.so.1()(64bit) \
libqmobipocket.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libtag.so.1()(64bit)"

inherit rpm
