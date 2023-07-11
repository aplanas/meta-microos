SUMMARY = "Development package for opal"
DESCRIPTION = "Static libraries and header files for development with opal."
LICENSE = "MPL-1.0"

PV = "3.18.8"

RPM_NAME = "libopal-devel-3.18.8-2.10.aarch64.rpm"
RPM_HASH = "c47bd539b667c6442a7cb100459ea867b8026fbabdf231d32b838d650b152e6a65aa922d3a815decdbfa84306e456a1959ea82a4e4ec2e6a962b31bb5e945509"

RPROVIDES:${PN} += "libopal-devel \
opal-devel \
pkgconfig-opal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopal3-18-8 \
pkgconfig-libsrtp2 \
pkgconfig-ptlib \
pkgconfig-speexdsp"

inherit rpm
