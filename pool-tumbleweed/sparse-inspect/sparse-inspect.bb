SUMMARY = "Inspect binary from sparse"
DESCRIPTION = "test-inspect is a gtk frontend for sparse."
LICENSE = "MIT"

PV = "0.6.4+20220627"

RPM_NAME = "sparse-inspect-0.6.4+20220627-2.2.aarch64.rpm"
RPM_HASH = "ffe388870154c46565f2147efcde0f4742676b35da2679b79ac03f8224645135a932c41415b4e7cb60b08cdbfa852f6f8c6adcd56313178587ae7a82cd9e23db"

RPROVIDES:${PN} += "sparse-inspect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
