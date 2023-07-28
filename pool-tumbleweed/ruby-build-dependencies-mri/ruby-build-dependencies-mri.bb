SUMMARY = "Meta package for dependencies to build MRI"
DESCRIPTION = "Meta package for ruby-build dependencies to build MRI."
LICENSE = "MIT"

PV = "20230717"

RPM_NAME = "ruby-build-dependencies-mri-20230717-1.1.noarch.rpm"
RPM_HASH = "ba78c8ff24d19ef7d7686eae0aaf3d76286a084bb06d5c0c9824b00f710c401d06dfc645ad64f04ce6b3db633b60db54a550e2d159569aa3f16443ddc08a8a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-mri"

RDEPENDS:${PN} += "automake \
bison \
gcc \
gdbm-devel \
gperf \
graphviz \
libffi-devel \
libjpeg-devel \
libyaml-devel \
openssl-devel \
readline-devel \
tk-devel"

inherit rpm
