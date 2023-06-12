SUMMARY = "Monitor inotify limits and inform the user when they are reached"
DESCRIPTION = "Tooling for monitoring inotify limits and informing the user \
when they have been or are about to be reached."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kde-inotify-survey-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2156206a3835395d973ba6431c544b06ae8671117cddf74254a78cecf30037fd7c87b2ec327769eb21f1077d575da2fe882a456efd7afa178055391f6287296c"

RPROVIDES:${PN} += "kde-inotify-survey \
kde-inotify-survey(aarch-64) \
metainfo() \
metainfo(org.kde.inotify-survey.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5AuthCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit)"

inherit rpm
