SUMMARY = "Development files for liblms7compact"
DESCRIPTION = "Compact LMS7002 library suitable for MCU. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblms7compact."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20200518"

RPM_NAME = "liblms7002m-devel-0.0.0+git.20200518-1.11.aarch64.rpm"
RPM_HASH = "eb41dd29bc30dcb6f73a0e474e3d1cc277cfcc8f490f46a187cef784d3dcd0fc778234fb18e0f00109cb4683685dc3c49f16684165af0ed807cc1c98ccf63544"

RPROVIDES:${PN} += "liblms7002m-devel \
liblms7002m-devel(aarch-64)"

RDEPENDS:${PN} += "liblms7compact0"

inherit rpm
