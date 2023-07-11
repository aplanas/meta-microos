SUMMARY = "The Development Files for the Firewall Knock Operator Library"
DESCRIPTION = "The Firewall Knock Operator library, libfko, provides the Single Packet \
Authorization implementation and API for the other fwknop components. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfko."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "libfko-devel-2.6.10-3.9.aarch64.rpm"
RPM_HASH = "22a0affa9ee5adaef115c011d619ea90777b767f1bfb511bd2b223e016fa3ca147cd37f363b567fb11f4a60472530c0e50e243f33e0b7141fe0020a4497ae37f"

RPROVIDES:${PN} += "libfko-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libfko3"

inherit rpm
