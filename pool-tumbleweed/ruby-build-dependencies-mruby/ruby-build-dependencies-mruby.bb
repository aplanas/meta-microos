SUMMARY = "Meta package for dependencies to build mruby"
DESCRIPTION = "Meta package for ruby-build dependencies to build mruby."
LICENSE = "MIT"

PV = "20230710"

RPM_NAME = "ruby-build-dependencies-mruby-20230710-1.1.noarch.rpm"
RPM_HASH = "3dd4e79458490d1f093e28bd0240e404a3cac5b6174b1cfaf04390543faf631645d24aa2d4e9800a53ac43f034500c96bdfbd93b99a0453834697211c1a36747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-mruby"

RDEPENDS:${PN} += "gcc \
git"

inherit rpm
