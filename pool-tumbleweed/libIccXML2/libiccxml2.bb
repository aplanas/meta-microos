SUMMARY = "Colour Management Libraries"
DESCRIPTION = "IccLibXML library acts as an extension of SampleICC's IccProfLib. \
This extension provides inherited classes for the classes in IccProfLib \
that provide additional I/O routines to read and write the classes as \
XML files"
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "libIccXML2-0.9.8-2.27.aarch64.rpm"
RPM_HASH = "f0efd5d051686d1e0d0b9a9f9f11e7cf71165ee3d5f984457fb852227ec18fa68bdd055d897387ba703512d1604b010e7471241f676ec74a1b9e9a966919d746"

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
