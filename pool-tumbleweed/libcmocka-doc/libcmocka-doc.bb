SUMMARY = "Documentation for the cmocka library"
DESCRIPTION = "Documentation for the cmocka unit testing library."
LICENSE = "Apache-2.0"

PV = "1.1.7"

RPM_NAME = "libcmocka-doc-1.1.7-3.1.aarch64.rpm"
RPM_HASH = "23bd71e85b3fcf9f840b656368bf5acd883b7ab6ff7c83b474c52619b2efd618c3fe2cff37a21d5caccae6ea9fbd9dde2dcebe4b4b6399b0216fa79f3c6dadc1"

RPROVIDES:${PN} += "libcmocka-devel-/usr/share/doc/packages/libcmocka-devel \
libcmocka-doc"

RDEPENDS:${PN} += ""

inherit rpm
