SUMMARY = "Development files for ptlib (includes headers and scripts)"
DESCRIPTION = "This package includes header files and scripts needed for developers \
using the ptlib library."
LICENSE = "MPL-1.0"

PV = "2.18.8"

RPM_NAME = "ptlib-devel-2.18.8-1.7.aarch64.rpm"
RPM_HASH = "a66c1898bc129423d1ba9f8817a0f37f335bd9ff7e28c52536e572c0fd7df33b4fe93f5dd6a56af869a5db1269408758a7ccf45e6b7e97a94b28b52ab798360f"

RPROVIDES:${PN} += "libpt-devel \
libpt2-devel \
pkgconfig-ptlib \
ptlib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpt2-18-8"

inherit rpm
