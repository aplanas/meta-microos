SUMMARY = "Meta package for dependencies to build MRI"
DESCRIPTION = "Meta package for ruby-build dependencies to build MRI."
LICENSE = "MIT"

PV = "20230615"

RPM_NAME = "ruby-build-dependencies-mri-20230615-1.1.noarch.rpm"
RPM_HASH = "fb7cb4d26a94b6edd8d1f97946ff4497b4b130233a6a798a63afabcf63ab8b0eb04b7a2be29bf9aac9f560f55d413454af11d86cc8e7fac4405fb4ab620f0ebe"
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
