SUMMARY = "wxWidgets base library"
DESCRIPTION = "Every wxWidgets application must link against this library. It \
contains mandatory classes that any wxWidgets code depends on (e.g. \
wxString) and portability classes that abstract differences between \
platforms. wxBase can be used to develop console-only applications. \
This variant of wxWidgets is built without STL types (such as \
std::string), and is provided for old programs which fail to use e.g. \
wxString and instead rely on the wxChar pointer API."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_baseu-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "a368f76c91cb6a13b79e699e3c0aafcc824546ebd77b7b214358faf7ed6e55b3e046466bf5a299958415b4b1696cd302a530d2adebb4776198ad37a1be48e2da"

RPROVIDES:${PN} += "libwx_baseu-suse-nostl.so.9.0.0()(64bit) \
libwx_baseu-suse-nostl9_0_0 \
libwx_baseu-suse-nostl9_0_0(aarch-64) \
wxWidgets"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpcre2-32.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
