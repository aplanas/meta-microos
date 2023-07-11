SUMMARY = "Development files for yascreen"
DESCRIPTION = "This package contains the header files and libraries needed to \
compile applications or shared objects that use yascreen."
LICENSE = "LGPL-3.0-or-later"

PV = "1.97"

RPM_NAME = "yascreen-devel-1.97-1.4.aarch64.rpm"
RPM_HASH = "9e5910be0e47a67c95ee468bf361a2bb090cbbbb57a16f3629adcd58e08bb25e250e08cdda8836e9695c6ccafe4cfeda8b1444cb7859b69752be53fc1af4b595"

RPROVIDES:${PN} += "pkgconfig-yascreen \
yascreen-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyascreen0"

inherit rpm
