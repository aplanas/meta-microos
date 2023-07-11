SUMMARY = "Meta package for dependencies to build TruffleRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build TruffleRuby."
LICENSE = "MIT"

PV = "20230615"

RPM_NAME = "ruby-build-dependencies-truffleruby-20230615-1.1.noarch.rpm"
RPM_HASH = "50098c0258fa603e9793a99ccef40c91d50c3f5920e195e8def079a2d0325e67cfe85e76d689c7f64f0775e123abda11ee5812c898a1d133e2e78e0257f6b8d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-truffleruby"

RDEPENDS:${PN} += "gcc \
openssl-devel"

inherit rpm
