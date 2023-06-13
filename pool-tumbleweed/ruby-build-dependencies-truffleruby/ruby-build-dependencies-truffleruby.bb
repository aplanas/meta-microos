SUMMARY = "Meta package for dependencies to build TruffleRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build TruffleRuby."
LICENSE = "MIT"

PV = "20230512"

RPM_NAME = "ruby-build-dependencies-truffleruby-20230512-1.1.noarch.rpm"
RPM_HASH = "604cf0d315bbbbb3b97ad0821ce3774ae780d7ad538a43418d92f4a89a4c3bd6d777f52a45d22a1d9bf974abccedc734374cccf6e0b61b13f9d633ec066a4433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-truffleruby"

RDEPENDS:${PN} += "gcc \
openssl-devel"

inherit rpm
