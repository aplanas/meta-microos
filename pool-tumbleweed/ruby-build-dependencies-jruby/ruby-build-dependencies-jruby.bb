SUMMARY = "Meta package for dependencies to build JRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build JRuby."
LICENSE = "MIT"

PV = "20230717"

RPM_NAME = "ruby-build-dependencies-jruby-20230717-1.1.noarch.rpm"
RPM_HASH = "32c1227f8ba48df6b27351ce71f864e5c75cf4c4d78ce70236835487a4c5987f837a434c0d45ff09610844064efd530747a40385c028b95c2900736378c457de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-jruby"

RDEPENDS:${PN} += "gcc-c++"

inherit rpm
