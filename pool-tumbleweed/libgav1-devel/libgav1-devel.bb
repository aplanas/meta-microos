SUMMARY = "Development for libgav1, an AV1 video decoder"
DESCRIPTION = "libgav1 is a Main profile (0) & High profile (1) compliant AV1 decoder written \
in C++ and also offering a C API. \
 \
This subpackage contains the header files."
LICENSE = "Apache-2.0"

PV = "0.18.0"

RPM_NAME = "libgav1-devel-0.18.0-2.2.aarch64.rpm"
RPM_HASH = "ec18419164e0ab3dbe1639ab37d48eb872431913ecdc5663c11446772b0943bf2233c3bdc3b3a81b7711bedba8b24be2450f8bee4f1e32f22bb4f8a3758cd4bb"

RPROVIDES:${PN} += "libgav1-devel \
pkgconfig-libgav1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgav1-1"

inherit rpm
