SUMMARY = "Meta package for dependencies to build mruby"
DESCRIPTION = "Meta package for ruby-build dependencies to build mruby."
LICENSE = "MIT"

PV = "20230615"

RPM_NAME = "ruby-build-dependencies-mruby-20230615-1.1.noarch.rpm"
RPM_HASH = "e4a2fbc5a7e16c4ed014b139cbafbeb32315a96836ef41b2eab0d2d21f5498f66e540112b12a5328f2d0c39de68fda237aa8894489c4ef81b477f5358d579e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-mruby"

RDEPENDS:${PN} += "gcc \
git"

inherit rpm
