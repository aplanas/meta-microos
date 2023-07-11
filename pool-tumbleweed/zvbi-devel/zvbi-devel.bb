SUMMARY = "Development files for the VBI decoding library"
DESCRIPTION = "This package includes the development files for the zvbi library which \
provides routines to read from raw VBI sampling devices, to demodulate raw to \
sliced VBI data, and to interpret the data of several popular services."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.41"

RPM_NAME = "zvbi-devel-0.2.41-2.2.aarch64.rpm"
RPM_HASH = "1111b749aa7040ce35905d6108861e1d928444ba8d4661592ad774febf1581c6b28c2389aa6b7ae5da754183fcb1a597c69fd44f154ec51052979b328bcaf1ac"

RPROVIDES:${PN} += "pkgconfig-zvbi-0.2 \
zvbi-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzvbi-chains0 \
libzvbi0"

inherit rpm
