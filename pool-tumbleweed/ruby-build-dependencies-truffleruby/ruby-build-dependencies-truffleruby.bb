SUMMARY = "Meta package for dependencies to build TruffleRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build TruffleRuby."
LICENSE = "MIT"

PV = "20230717"

RPM_NAME = "ruby-build-dependencies-truffleruby-20230717-1.1.noarch.rpm"
RPM_HASH = "121d396bba521f44bcd9dd739a54cebc1e4fb853e73c135672e6ad63c1ab6c986795c9637d14b8498752d6085ecc6d7c29e6415d54f7d2bac8f130307a040504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-truffleruby"

RDEPENDS:${PN} += "gcc \
openssl-devel"

inherit rpm
