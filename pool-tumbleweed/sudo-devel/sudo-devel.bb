SUMMARY = "Header files needed for sudo plugin development"
DESCRIPTION = "These header files are needed for building of sudo plugins."
LICENSE = "ISC"

PV = "1.9.13p3"

RPM_NAME = "sudo-devel-1.9.13p3-3.3.aarch64.rpm"
RPM_HASH = "16903f90bebe542bf8bb6520b3d4e970edc345e8943ecf8d3949505502d368e7a01e3f90971940c93046f309e382722b902e375ca1e46584b3d794069dce9082"

RPROVIDES:${PN} += "sudo-devel"

RDEPENDS:${PN} += "sudo"

inherit rpm
