SUMMARY = "Library to facilitate retrieval of weather information"
DESCRIPTION = "Shared objects for kweathercore. \
Get weather forecast and alerts anywhere on the earth easy. KWeatherCore \
provides you a highly abstracted library for things related to weather: \
Get local weather forecast, get weather of a location by name or coordinate, \
get sunrise/set moonrise/set and many more informations about a location."
LICENSE = "LGPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "libKF5KWeatherCore5-0.7-1.2.aarch64.rpm"
RPM_HASH = "d608ae6f77096302424ae4b4406ebdb96e157ff03406d21456e80f31bd810de6c6829a6282fee070c4c7290ed1f6a1060cc7cebab14d3f2d54f4d81438814617"

RPROVIDES:${PN} += "libKF5KWeatherCore.so.5 \
libKF5KWeatherCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Holidays.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Positioning.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
