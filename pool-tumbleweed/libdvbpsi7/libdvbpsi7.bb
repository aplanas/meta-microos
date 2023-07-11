SUMMARY = "Library for Decoding and Generating MPEG TS and DVB PSI Tables"
DESCRIPTION = "libdvbpsi is a simple library designed for decoding and generating \
   MPEG TS and DVB PSI tables. Current features: * Program \
   Association Table (PAT), decoder and generator. \
 \
* Program Map Table (PMT), decoder and generator. \
* All MPEG 2 descriptors, decoders and generators."
LICENSE = "LGPL-2.1+"

PV = "0.2.2"

RPM_NAME = "libdvbpsi7-0.2.2-6.27.aarch64.rpm"
RPM_HASH = "f79da0db5b503b017f26fd68cca5cf6cb726260894798099e1a2937e364c1b1c8c31c84803bbcc75b7deebbc880afc4fc5b558b8e5893521d6fab4ae44d6062b"

RPROVIDES:${PN} += "libdvbpsi.so.7 \
libdvbpsi7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
