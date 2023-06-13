SUMMARY = "Development files for the libregraphAPI library"
DESCRIPTION = "Libregraphapi is a MS Graph API influenced API for cloud collaboration. \
 \
This package contains development files for libregraphapi."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "libregraphapi-devel-1.0.4-1.1.aarch64.rpm"
RPM_HASH = "5730d9e4754766ea72d3de92e867d3b44f870a2879dee217d9fecac49851283182d6c383b0e79ac353312b4ea31b4a951ea02b89d394ffab6fb7b7b98f0b5f94"

RPROVIDES:${PN} += "cmake(LibreGraphAPI) \
libregraphapi-devel \
libregraphapi-devel(aarch-64)"

RDEPENDS:${PN} += "libLibreGraphAPI1"

inherit rpm
