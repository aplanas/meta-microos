SUMMARY = "Development files for yascreen"
DESCRIPTION = "This package contains the header files and libraries needed to \
compile applications or shared objects that use yascreen."
LICENSE = "LGPL-3.0-or-later"

PV = "1.97"

RPM_NAME = "yascreen-devel-1.97-1.3.aarch64.rpm"
RPM_HASH = "1bd6cd183d5483e483a1d1caff83a476627c7e55884e7f0e9be16842cb96595dfefcb7aee88643a17301ede56462e6b68fd0b06d01fc7c3c349daf34c7e4b8b0"

RPROVIDES:${PN} += "pkgconfig(yascreen) \
yascreen-devel \
yascreen-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyascreen0"

inherit rpm
