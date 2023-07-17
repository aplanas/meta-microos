SUMMARY = "Meta package for dependencies to build MRI"
DESCRIPTION = "Meta package for ruby-build dependencies to build MRI."
LICENSE = "MIT"

PV = "20230710"

RPM_NAME = "ruby-build-dependencies-mri-20230710-1.1.noarch.rpm"
RPM_HASH = "20cc0dedbe46834382e966926784147903d7a225e32bb39bbb42b8ba1179b0010a457cc7e74fddedccd4907a28a8124c7187468cd7d05aa48d3f28cb7a62b4a7"
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
