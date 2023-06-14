SUMMARY = "Headers, Configuration and static Libs + Documentation"
DESCRIPTION = "Header files, libraries and documentation for development of Color Management \
applications."
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "libIccXML-devel-0.9.8-2.26.aarch64.rpm"
RPM_HASH = "d9b87d2cc1dd88b3f69dae3fac4d50b8172cd4ddefed5a273f0d9741fc6d3273214a3a7b479e6538322883796227666711643a74f0c3a0c00fec93bea7babd5c"

RPROVIDES:${PN} += "libIccXML-devel \
pkgconfig-iccxml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libIccXML2"

inherit rpm
