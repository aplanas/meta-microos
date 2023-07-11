SUMMARY = "Chinese Lunar calendar library development files"
DESCRIPTION = "Development files for Chinese Lunar calendar library"
LICENSE = "GPL-2.0-or-later"

PV = "2.9.3"

RPM_NAME = "lunar-date-devel-2.9.3-2.15.aarch64.rpm"
RPM_HASH = "771542f7bf8bc1189173dff74df6e7236a22c9f123de6c865a9c5fe68bd64221c29bf43a884e3cf07c9423f1efaa35b96b9074ccfd1378692486ac3a811895df"

RPROVIDES:${PN} += "lunar-date-devel \
pkgconfig-lunar-date-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblunar-date-3-0-1 \
pkgconfig-gio-2.0 \
typelib-1-0-LunarDate-3-0"

inherit rpm
