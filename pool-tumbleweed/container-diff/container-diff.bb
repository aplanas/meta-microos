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

RPM_NAME = "container-diff-0.17.0-1.11.aarch64.rpm"
RPM_HASH = "7f47c35ee0e07b62c15e34a358e4d4c225e9ec199247a826d271a0c7f6915f64c85b5461e82e865aaa9d60a2d2833fe65fc5f3be4c6c4431ae0f75fa782b9834"

RPROVIDES:${PN} += "container-diff"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
