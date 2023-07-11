SUMMARY = "Extra plugins for TagLib"
DESCRIPTION = "Unofficial TagLib file type plugins maintained by the Amarok project"
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "taglib-extras-devel-1.0.1-24.17.aarch64.rpm"
RPM_HASH = "ac1c0ef55763e1a9dfda177597bbf28e3925eba710533ee0ae9a4c9c62b250c6acb599afec58a8fcd078a862619b80371dc8c68ef91c63b5f8ad165154d58545"

RPROVIDES:${PN} += "pkgconfig-taglib-extras \
taglib-extras-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libstdc++-devel \
libtag-extras1"

inherit rpm
