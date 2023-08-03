SUMMARY = "Headers for the Hardware Detection Library"
DESCRIPTION = "This library collects information about the hardware installed on a \
system."
LICENSE = "GPL-2.0-or-later"

PV = "23.2"

RPM_NAME = "hwinfo-devel-23.2-1.1.aarch64.rpm"
RPM_HASH = "151f5d5f5aec368aa61916447328a94885c361047097511268382db8f411c6f91ef3cc351b01d636805dc33dd984f6b17d8eda3b6138c366e5f093d5de204f7a"

RPROVIDES:${PN} += "hwinfo-devel \
libhddev \
pkgconfig-hwinfo"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat-devel \
libhd23 \
perl-XML-Parser \
perl-XML-Writer \
udev \
wireless-tools"

inherit rpm
