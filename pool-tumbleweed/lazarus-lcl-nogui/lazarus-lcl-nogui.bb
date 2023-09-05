SUMMARY = "Lazarus Component Library - non-graphical components"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package contains LCL components for developing non-graphical applications \
and command-line tools."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "2.2.6"

RPM_NAME = "lazarus-lcl-nogui-2.2.6-2.1.aarch64.rpm"
RPM_HASH = "5736b43c16c2c3d54de9d12528a4f66537e7350b084cfa86009c68fc33ad7eaacdb88869aac2834a64fb0c95f19544d8383d804192c3a8e8caf36ee31a36b229"

RPROVIDES:${PN} += "lazarus-lcl-nogui"

RDEPENDS:${PN} += "lazarus-lcl"

inherit rpm
