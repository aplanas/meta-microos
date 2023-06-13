SUMMARY = "Library for Colour ASCII Art, text mode graphics"
DESCRIPTION = "This package contains the header files and static libraries needed to \
compile applications or shared objects that use libcaca."
LICENSE = "WTFPL"

PV = "0.99.beta20"

RPM_NAME = "libcaca-devel-0.99.beta20-1.4.aarch64.rpm"
RPM_HASH = "645533a669fa72b00683319b6b1b59119e60862bc3820f27e8206bedb1ad99db897bc8d5fafde516a2a514f8f16d7106fb53f314471e1676edbd98a065c62d46"

RPROVIDES:${PN} += "libcaca-devel \
libcaca-devel(aarch-64) \
pkgconfig(caca) \
pkgconfig(caca++)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libcaca \
libcaca0-plugins"

inherit rpm
