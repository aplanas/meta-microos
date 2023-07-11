SUMMARY = "Headers for the Hardware Detection Library"
DESCRIPTION = "This library collects information about the hardware installed on a \
system."
LICENSE = "GPL-2.0-or-later"

PV = "23.1"

RPM_NAME = "hwinfo-devel-23.1-1.1.aarch64.rpm"
RPM_HASH = "11cd59623b658557c2049f9534dc6617867d06665f58344587f669598028bc9153f97f500f3eb4d18d475a926902efbefa307fcbb446c803e534c2d14b10fb95"

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
