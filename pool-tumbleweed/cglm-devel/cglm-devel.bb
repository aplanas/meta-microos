SUMMARY = "Header files for C OpenGL Mathematics"
DESCRIPTION = "This package contains development files for cglm."
LICENSE = "MIT"

PV = "0.8.9"

RPM_NAME = "cglm-devel-0.8.9-1.3.aarch64.rpm"
RPM_HASH = "a2448dcc899dfea2e35f89a4b1012791464d8a00f809471893ec732f581fcf02bf29864d8d9f8960904390ad5e34f802dd3fe5546f0ea54a21dc6e9a785ad8f7"

RPROVIDES:${PN} += "cglm-devel \
pkgconfig-cglm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcglm0"

inherit rpm
