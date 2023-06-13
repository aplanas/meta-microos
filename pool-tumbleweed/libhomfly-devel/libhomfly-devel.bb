SUMMARY = "Development files for the homfly library"
DESCRIPTION = "A library to compute the homfly polynomial of a link. \
 \
This subpackage provides the development headers for it."
LICENSE = "SUSE-Public-Domain"

PV = "1.02r6"

RPM_NAME = "libhomfly-devel-1.02r6-1.2.aarch64.rpm"
RPM_HASH = "ef55365a388443ab142f9e5a9e3108e13c578bafb889eefa7c4950abea62832e87d8ef34db3f3aa7fc6f786973b409be0f5a79755c46a3e51821cf57e7f9372e"

RPROVIDES:${PN} += "libhomfly-devel \
libhomfly-devel(aarch-64)"

RDEPENDS:${PN} += "libhomfly0"

inherit rpm
