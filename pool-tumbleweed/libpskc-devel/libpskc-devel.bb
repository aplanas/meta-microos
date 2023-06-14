SUMMARY = "Development files for the Portable Symmetric Key Container library"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. \
 \
For managing secret key files, the Portable Symmetric Key Container \
(PSKC) format described in RFC6030 is supported. \
 \
This subpackage contains the headers for this library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.7"

RPM_NAME = "libpskc-devel-2.6.7-3.5.aarch64.rpm"
RPM_HASH = "53121c0613c444056761250ea403f53f647ecced244d7e04eaa92bc87c747c6d3d3af9def5e77817398f08e433a8c2e251c664409d8eea85a012fcdc7b8c89c1"

RPROVIDES:${PN} += "libpskc-devel \
pkgconfig-libpskc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libpskc0"

inherit rpm
