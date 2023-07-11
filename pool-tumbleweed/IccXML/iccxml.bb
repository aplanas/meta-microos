SUMMARY = "Color Management XML tools"
DESCRIPTION = "Tools to read convert ICC profiles to and from XML files"
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "IccXML-0.9.8-2.27.aarch64.rpm"
RPM_HASH = "9252dc8fec769f2817ecff227c462a491d15cd6692f78a6dfdacdbce0d4b5a15562943df98af481451df21a047469a0ac8a6547f9eafc92711001a0af93d265c"

RPROVIDES:${PN} += "IccXML"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIccXML.so.2 \
libSampleICC.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
