SUMMARY = "Development for libgav1, an AV1 video decoder"
DESCRIPTION = "libgav1 is a Main profile (0) & High profile (1) compliant AV1 decoder written \
in C++ and also offering a C API. \
 \
This subpackage contains the header files."
LICENSE = "Apache-2.0"

PV = "0.18.0"

RPM_NAME = "libgav1-devel-0.18.0-2.1.aarch64.rpm"
RPM_HASH = "066fec5aa7ebd597a43a35cfa01f8185139ba121ea3a8cc263e85d99f242e4d27abd512b6f006c3fa766c1cc039c80d50bf30e3ec4beba7d7bd956b59e6be3e6"

RPROVIDES:${PN} += "libgav1-devel \
libgav1-devel(aarch-64) \
pkgconfig(libgav1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgav1-1(aarch-64)"

inherit rpm
