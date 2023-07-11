SUMMARY = "Motif Include Files and Libraries Mandatory for Development"
DESCRIPTION = "This package provies the include files and libraries necessary for developing \
Motif applications."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "motif-devel-2.3.8-2.5.aarch64.rpm"
RPM_HASH = "e108c1e282b9e80b9e2d596ff72a42dbfac6ebe5cd1eb6cb9dd368751e1f72d665e51d14729de5a7e5cfa98d49cb98a7ff07628ab6c19b7dfe441a56541ee605"

RPROVIDES:${PN} += "motif-devel \
openmotif-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMrm.so.4 \
libMrm4 \
libUil4 \
libXm.so.4 \
libXm4 \
libXt.so.6 \
libc.so.6 \
pkgconfig-printproto \
pkgconfig-x11 \
pkgconfig-xft \
pkgconfig-xproto \
pkgconfig-xt"

inherit rpm
