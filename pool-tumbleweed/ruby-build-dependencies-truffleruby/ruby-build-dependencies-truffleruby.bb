SUMMARY = "Meta package for dependencies to build TruffleRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build TruffleRuby."
LICENSE = "MIT"

PV = "20230904"

RPM_NAME = "ruby-build-dependencies-truffleruby-20230904-1.1.noarch.rpm"
RPM_HASH = "1923ad3143fb3e7639da14d996a42fc3638b244a05189f00f2dd89cf66df87e1add9562394920c56ace230c6e145e018368c580c8755e2a8881d10a8379bef3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-truffleruby"

RDEPENDS:${PN} += "gcc \
openssl-devel"

inherit rpm
