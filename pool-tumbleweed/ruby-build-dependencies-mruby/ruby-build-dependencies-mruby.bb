SUMMARY = "Meta package for dependencies to build mruby"
DESCRIPTION = "Meta package for ruby-build dependencies to build mruby."
LICENSE = "MIT"

PV = "20230904"

RPM_NAME = "ruby-build-dependencies-mruby-20230904-1.1.noarch.rpm"
RPM_HASH = "546b19b245ec051b7a0e5364a3be1feb71710463bbf776054cb4334f65e0f6ab7332bf8a3a43563f524e1ffb1c5a731b0c6280e937e0ebfc3fca12187abae1a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-mruby"

RDEPENDS:${PN} += "gcc \
git"

inherit rpm
