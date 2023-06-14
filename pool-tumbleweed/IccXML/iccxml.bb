SUMMARY = "Color Management XML tools"
DESCRIPTION = "Tools to read convert ICC profiles to and from XML files"
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "IccXML-0.9.8-2.26.aarch64.rpm"
RPM_HASH = "c39a59388aaeefb072d493e91d10a97175bf121e36c3e47cb3ba73d50ee8faf8804256f49a8b1f590dd51b66cd264fb68e8496fe5f038ccb8863afceb24f8547"

RPROVIDES:${PN} += "IccXML"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIccXML.so.2 \
libSampleICC.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
