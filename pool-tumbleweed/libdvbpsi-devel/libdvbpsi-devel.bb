SUMMARY = "Development headers and libraries for libdvbpsi"
DESCRIPTION = "libdvbpsi is a simple library designed for decoding and generating \
MPEG TS and DVB PSI tables. Current features: * Program Association Table \
(PAT), decoder and generator."
LICENSE = "LGPL-2.1+"

PV = "1.3.3"

RPM_NAME = "libdvbpsi-devel-1.3.3-1.13.aarch64.rpm"
RPM_HASH = "2702b757cd99747dbc52247517da2ef0f843d21476252c74a5d188480d6204bc63fb7546239fb97e28582ab05cfffdd1f1cba2a3619c101c20563dc73b1d577d"

RPROVIDES:${PN} += "libdvbpsi-devel \
pkgconfig-libdvbpsi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdvbpsi10"

inherit rpm
