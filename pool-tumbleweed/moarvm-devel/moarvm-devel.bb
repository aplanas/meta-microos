SUMMARY = "MoarVM development headers and libraries"
DESCRIPTION = "MoarVM (Metamodel On A Runtime) development headers."
LICENSE = "Artistic-2.0"

PV = "2022.07"

RPM_NAME = "moarvm-devel-2022.07-4.3.noarch.rpm"
RPM_HASH = "6c02a464e1325cd645a4525238ad40df63457415e5d95f2aacdb5ee2f050e6ce4f94b12dbef5dcdb4ebbf1f1aa2ca045aad96d5641b74ebc293a78152a8686c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "moarvm-devel \
pkgconfig(moar)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
moarvm \
pkgconfig(libffi) \
pkgconfig(libtommath) \
pkgconfig(libuv) \
pkgconfig(libzstd)"

inherit rpm
