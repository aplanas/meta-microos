SUMMARY = "Library to facilitate retrieval of weather information"
DESCRIPTION = "Shared objects for kweathercore. \
Get weather forecast and alerts anywhere on the earth easy. KWeatherCore \
provides you a highly abstracted library for things related to weather: \
Get local weather forecast, get weather of a location by name or coordinate, \
get sunrise/set moonrise/set and many more informations about a location."
LICENSE = "LGPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "libKF5KWeatherCore5-0.7-1.1.aarch64.rpm"
RPM_HASH = "279417ccbd7c8fc028700ab0083d78b818c981fd0a5dcf604a7fc1c6ff15d271f86f30158b3854547daf472da716ba7abcf79f52e45ef8b053fcf7919c076c4c"

RPROVIDES:${PN} += "libKF5KWeatherCore.so.5()(64bit) \
libKF5KWeatherCore5 \
libKF5KWeatherCore5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Holidays.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5()(64bit) \
libQt5Positioning.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm