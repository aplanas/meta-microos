SUMMARY = "Meta package for dependencies to build JRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build JRuby."
LICENSE = "MIT"

PV = "20230615"

RPM_NAME = "ruby-build-dependencies-jruby-20230615-1.1.noarch.rpm"
RPM_HASH = "6e0abdfc01acd0f2d63c22f5b0cb7a74d50609d3307e9463940260fc24083604a99fa452a9c7b0ff93807b52b23b66450bbb0d6f86cac106235192a8446cb77c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-jruby"

RDEPENDS:${PN} += "gcc-c++"

inherit rpm
