SUMMARY = "CFD General Notation System library"
DESCRIPTION = "Static CGNS (CFD General notation system) library."
LICENSE = "Zlib"

PV = "4.3.0"

RPM_NAME = "cgns-devel-static-4.3.0-1.7.aarch64.rpm"
RPM_HASH = "4cf610aaa9b9de7fa9519fbd2ae6b6a786ebc16d0b10dbb135ad349958cc08af8feb18260042230aabb164836aab043c8cb3265368886505e59a0be4ccb9bc36"

RPROVIDES:${PN} += "cgns-devel-static \
cgns-devel-static(aarch-64)"

RDEPENDS:${PN} += "cgns-devel"

inherit rpm
