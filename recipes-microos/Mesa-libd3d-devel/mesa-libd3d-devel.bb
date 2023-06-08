SUMMARY = "Mesa Direct3D9 state tracker development package"
DESCRIPTION = "Mesa Direct3D9 state tracker development package"
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libd3d-devel-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "9104f42332dbbb0c7e4b1cb9994775fc42a4c5f5599d7a9eb18666150199c98126e9f4cd5ab6f79ab7a03f4b463d178f082fddb20f3978f30e36fdb453bbd057"

RPROVIDES:${PN} += "Mesa-libd3d-devel Mesa-libd3d-devel(aarch-64) pkgconfig(d3d)"
RDEPENDS:${PN} += "/usr/bin/pkg-config Mesa-libd3d pkgconfig(libdrm)"

inherit rpm
