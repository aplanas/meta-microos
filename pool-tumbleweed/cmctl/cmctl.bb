SUMMARY = "CLI tool that can help you to manage cert-manager resources inside your cluster"
DESCRIPTION = "cmctl is a CLI tool that can help you to manage cert-manager resources inside your cluster. \
While also available as a kubectl plugin, it is recommended to use as a stand alone binary as this allows the use of command auto-completion."
LICENSE = "Apache-2.0"

PV = "1.12.3"

RPM_NAME = "cmctl-1.12.3-1.1.aarch64.rpm"
RPM_HASH = "eaeb329ff94c3d686fc204f063f90bbdae405dedc8e65fc50fdb32b7221feb74df257a34fa3d5e5b60edcd584900f97867d6befea666880b612de7a7c1f30c6a"

RPROVIDES:${PN} += "cmctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
