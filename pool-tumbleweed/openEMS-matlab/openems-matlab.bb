SUMMARY = "MATLAB interface for openEMS"
DESCRIPTION = "Electromagnetic field solver using the EC-FDTD method. \
 \
This package provides MATLAB interface for openEMS."
LICENSE = "GPL-3.0-only"

PV = "0.0.35"

RPM_NAME = "openEMS-matlab-0.0.35-5.37.aarch64.rpm"
RPM_HASH = "f67973f067a9a001aed50bc877caf8c54dbe4ee26ba5cb0886398c5779132063f34aef37cf85243517a9cd5f8ae53b9819fbca180b0e44219f3df691b4c9032c"

RPROVIDES:${PN} += "openEMS-matlab"

RDEPENDS:${PN} += "AppCSXCAD \
CSXCAD-matlab \
openEMS"

inherit rpm
