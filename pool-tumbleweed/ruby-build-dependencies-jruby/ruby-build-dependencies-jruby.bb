SUMMARY = "Meta package for dependencies to build JRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build JRuby."
LICENSE = "MIT"

PV = "20230512"

RPM_NAME = "ruby-build-dependencies-jruby-20230512-1.1.noarch.rpm"
RPM_HASH = "4b760240a3c9f2f363b82d4b7946227c74c2360dce69edeeea2a6619f0a379d9d99bfee61537ceb700472daa5983f75711e20d0778939af5e1cf380e5fd90084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-jruby"
RDEPENDS:${PN} += "gcc-c++"

inherit rpm
