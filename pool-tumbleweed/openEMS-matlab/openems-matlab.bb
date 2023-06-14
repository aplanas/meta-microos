SUMMARY = "MATLAB interface for openEMS"
DESCRIPTION = "Electromagnetic field solver using the EC-FDTD method. \
 \
This package provides MATLAB interface for openEMS."
LICENSE = "GPL-3.0-only"

PV = "0.0.35"

RPM_NAME = "openEMS-matlab-0.0.35-5.36.aarch64.rpm"
RPM_HASH = "1536262b12ca1fdda5df52c313cc5a307f3104392fb2fc1242a39f3305eb08fc6ff99750fe50bfad9edbc2f070f8cc1b8ced0b8b602de9467e1b3cb3278fc281"

RPROVIDES:${PN} += "openEMS-matlab"

RDEPENDS:${PN} += "AppCSXCAD \
CSXCAD-matlab \
openEMS"

inherit rpm
