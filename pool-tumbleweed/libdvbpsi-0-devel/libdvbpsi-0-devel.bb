SUMMARY = "Library for Decoding and Generation of MPEG TS and DVB PSI Tables"
DESCRIPTION = "libdvbpsi is a simple library designed for decoding and generation of \
MPEG TS and DVB PSI tables. \
 \
Current features: * Program Association Table (PAT), decoder and \
   generator. \
 \
* Program Map Table (PMT), decoder and generator. \
* All MPEG 2 descriptors, decoders and generators."
LICENSE = "LGPL-2.1+"

PV = "0.2.2"

RPM_NAME = "libdvbpsi-0-devel-0.2.2-6.27.aarch64.rpm"
RPM_HASH = "85e9b8c8d98543fd7b7d46383363315dc5d3821b171f04f0e57baeee8a144b056b1527c1b263059bda53179e73cf69b207da5d05ea698bea99f63aa2fa1a74b0"

RPROVIDES:${PN} += "libdvbpsi-0-devel \
libdvbpsi-devel \
pkgconfig-libdvbpsi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdvbpsi7"

inherit rpm
