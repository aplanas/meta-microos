SUMMARY = "Meta package for dependencies to build JRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build JRuby."
LICENSE = "MIT"

PV = "20230904"

RPM_NAME = "ruby-build-dependencies-jruby-20230904-1.1.noarch.rpm"
RPM_HASH = "c5818907eebdecfcfa7957257a6f68e5b5432cff926d18bb873f80a1021015a5bad076d6c67a5ca483fa39e334944b246e85373e63a44227b4b8a7f55c42a8fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-jruby"

RDEPENDS:${PN} += "gcc-c++"

inherit rpm
