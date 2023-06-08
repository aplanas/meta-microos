SUMMARY = "Tool to analyze and compare container images"
DESCRIPTION = "container-diff is a tool for analyzing and comparing container images. \
container-diff can examine images along several different criteria, including: \
- Docker Image History \
- Image file system \
- Apt packages \
- RPM packages \
- pip packages \
- npm packages \
 \
These analyses can be performed on a single image, or a diff can be performed \
on two images to compare."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "container-diff-0.17.0-1.9.aarch64.rpm"
RPM_HASH = "37c893e5604208efa6da4737a10c59aa9149a231f75d66d5484c3735a7858547d0247396db105f011322c623821e85a9934d0d427bc0b1284e4ff989d438213d"

RPROVIDES:${PN} += "container-diff container-diff(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
