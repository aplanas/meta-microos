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

RPM_NAME = "container-diff-0.17.0-1.10.aarch64.rpm"
RPM_HASH = "a824ecd152fe85ee79b0c67395cf0d02380f61ea97ac715a792cde267b645432989a7065edcb00e241d8cdbbe9c5242628cb4940e274ca6638c5a146779b66a3"

RPROVIDES:${PN} += "container-diff \
container-diff(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
