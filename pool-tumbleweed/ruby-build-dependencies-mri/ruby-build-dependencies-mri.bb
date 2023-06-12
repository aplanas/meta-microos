SUMMARY = "Meta package for dependencies to build MRI"
DESCRIPTION = "Meta package for ruby-build dependencies to build MRI."
LICENSE = "MIT"

PV = "20230512"

RPM_NAME = "ruby-build-dependencies-mri-20230512-1.1.noarch.rpm"
RPM_HASH = "8cb4c5c6df09729d509432a06599f5a5895f0420aca2ecd5a591e68d6c4020fe4c8fcc9c9a804f29a8e755f794a26cf678f75b08bbb0738f03f1a07c459c1f04"
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
