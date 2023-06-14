SUMMARY = "Colour Management Libraries"
DESCRIPTION = "IccLibXML library acts as an extension of SampleICC's IccProfLib. \
This extension provides inherited classes for the classes in IccProfLib \
that provide additional I/O routines to read and write the classes as \
XML files"
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "libIccXML2-0.9.8-2.26.aarch64.rpm"
RPM_HASH = "2786ff9b8f28a0932c00d4a1cabcdce27bd2d1ce0f87174ca5c31fe062920783b6b5cb635a335fa2c9c23274d0811e192f2cb9121a4a97c470ad3a38e339288b"

RPROVIDES:${PN} += "libIccXML.so.2 \
libIccXML2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSampleICC.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
