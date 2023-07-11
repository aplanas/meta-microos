SUMMARY = "Development files for OpenSubdiv"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for OpenSubdiv. If you would like to develop programs using OpenSubdiv, \
you will need to install OpenSubdiv-devel."
LICENSE = "Apache-2.0"

PV = "3.4.4"

RPM_NAME = "OpenSubdiv-devel-3.4.4-1.9.aarch64.rpm"
RPM_HASH = "ac4dac4a8eea96e1a2036634a622267ff0e94f7f4986e6f3c879be0735996740b8c31a7ca1589471dd4145f301fcd6aa7c6889644b659b6ce4f97bfd07ab0c62"

RPROVIDES:${PN} += "OpenSubdiv-devel"

RDEPENDS:${PN} += "libosdCPU3-4-4"

inherit rpm
