SUMMARY = "Meta package for dependencies to build MRI"
DESCRIPTION = "Meta package for ruby-build dependencies to build MRI."
LICENSE = "MIT"

PV = "20230904"

RPM_NAME = "ruby-build-dependencies-mri-20230904-1.1.noarch.rpm"
RPM_HASH = "1457124e8e1206ab2cd04ad0ea243dde8564dc26654ecfbdac6466819800d50589d9e75a0ef2d8a267e85c13f67472c6ea783885c9759b3a296fedb0922f17b1"
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
