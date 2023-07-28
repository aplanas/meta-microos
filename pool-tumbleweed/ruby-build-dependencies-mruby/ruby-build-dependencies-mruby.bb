SUMMARY = "Meta package for dependencies to build mruby"
DESCRIPTION = "Meta package for ruby-build dependencies to build mruby."
LICENSE = "MIT"

PV = "20230717"

RPM_NAME = "ruby-build-dependencies-mruby-20230717-1.1.noarch.rpm"
RPM_HASH = "547c79152dc4243e57ea38243d4ff49cdc849e365266571b78aa1e22cc4c1e26d0314dd069ea771c4055a9b42b38a555868067311fab86e166e5a9245d98cb8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-mruby"

RDEPENDS:${PN} += "gcc \
git"

inherit rpm
