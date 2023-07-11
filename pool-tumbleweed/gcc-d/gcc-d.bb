SUMMARY = "The system GNU D Compiler"
DESCRIPTION = "The system GNU D Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-d-13-1.5.aarch64.rpm"
RPM_HASH = "494530e15c8e9db9f1dec738ea4e8b45416cc53a3f6ad6907c695b99f3b8e241babd8e961d653c8a8ed40a2f59fcfa07433bb4fdb440ec3e69f623c9a31be209"

RPROVIDES:${PN} += "gcc-d"

RDEPENDS:${PN} += "gcc \
gcc13-d \
update-alternatives"

inherit rpm
